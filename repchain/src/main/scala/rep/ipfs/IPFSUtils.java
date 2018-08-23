package rep.ipfs;


import io.ipfs.api.IPFS;
import io.ipfs.api.MerkleNode;
import io.ipfs.api.NamedStreamable;
import io.ipfs.multiaddr.MultiAddress;
import io.ipfs.multihash.Multihash;

import java.io.*;

public class IPFSUtils {
    /*public static void uploadIPFS() throws Exception{
        //创建节点
        IPFS ipfs = new IPFS("/ip4/192.168.56.1/tcp/5001");

        //初始化IPFS 加载
        ipfs.refs.local();
        //要添加文件使用
        NamedStreamable.FileWrapper file = new NamedStreamable.FileWrapper(new File("hello.txt"));

        //添加文件到IPFS返回HASH值
        Multihash addResult = null;

        {
            try {
                addResult = ipfs.add(file).hash;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //输出HASH值
        System.out.println(addResult);


        //查询IPFS里面的文件(通过HASH值查询)
        Multihash filePointer =Multihash.fromBase58("HASH值");

        byte[] data = null;    //通过HASH值查询文件转为byte[]

        {
            try {
                data = ipfs.cat(filePointer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //通过文件流输出
        InputStream inputStream=new ByteArrayInputStream(data);
        OutputStream os = response.getOutputStream();
        byte[] buffer = new byte[400];
        int length = 0;
        while ((length = inputStream.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
        os.flush();
        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downLoadIPFS(){
        OutputStream os = null;
        try {
            IPFS ipfs = new IPFS(new MultiAddress("/ip4/192.168.56.1/tcp/8888"));

            ipfs.refs.local();

            NamedStreamable.FileWrapper file = new NamedStreamable.FileWrapper(new File("D:/longpizi.png"));

            Multihash addResult = ipfs.add(file).hash;

            System.out.println(addResult);


            Multihash filePointer =Multihash.fromBase58("HASH值");
            byte[] data = ipfs.cat(filePointer);


            InputStream inputStream=new ByteArrayInputStream(data);
            os = response.getOutputStream();
            byte[] buffer = new byte[400];
            int length = 0;
            while ((length = inputStream.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (Exception e){
            e.getMessage();
        } finally {
            if (os != null) {
                try {
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/

    public  static byte[] getFile(String ipv4, String fileHash){
        byte[] fileContents = null;
        try {
            IPFS ipfs = new IPFS(ipv4);
            ipfs.refs.local();
            Multihash filePointer = Multihash.fromBase58(fileHash);
            fileContents = ipfs.cat(filePointer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContents;
    }

    public static MerkleNode putFile(String ipv4, byte[] byteContents){
        IPFS ipfs = new IPFS(ipv4);
        MerkleNode addResult = null;
        try {
            ipfs.refs.local();
            NamedStreamable.ByteArrayWrapper file = new NamedStreamable.ByteArrayWrapper(byteContents);
            addResult = ipfs.add(file).get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return addResult;
    }

    public static void byte2File(byte[] buf, String filePath, String fileName)
    {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try
        {
            File dir = new File(filePath);
            if (!dir.exists() && dir.isDirectory())
            {
                dir.mkdirs();
            }
            file = new File(filePath + File.separator + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(buf);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (bos != null)
            {
                try
                {
                    bos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (fos != null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static byte[] File2byte(String filePath)
    {
        byte[] buffer = null;
        try
        {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1)
            {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return buffer;
    }
}
