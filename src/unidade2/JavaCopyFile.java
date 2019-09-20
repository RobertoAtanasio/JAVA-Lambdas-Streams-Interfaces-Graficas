package unidade2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;	

public class JavaCopyFile {

	private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	
	private static void copyFileUsingChannel(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        sourceChannel = new FileInputStream(source).getChannel();
	        destChannel = new FileOutputStream(dest).getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
	
	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
		dest.delete();
	    Files.copy(source.toPath(), dest.toPath());
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		double elapsedTimeInSecond;
		double elapsedTimeInSecond2;
		long elapsedTime;
		
        File source = new File("C:/Java/arquivosteste/video1.mp4");
        File dest = new File("C:/Java/arquivosteste/video2.mp4");

        //copy file conventional way using Stream
        long start = System.nanoTime();
        copyFileUsingStream(source, dest);
        elapsedTime = System.nanoTime()-start;
        // 1 second = 1_000_000_000 nano seconds
        elapsedTimeInSecond = (double) elapsedTime / 1000000000;
        elapsedTimeInSecond2 = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);		// número inteiro
        System.out.println("Time 1 taken by Stream Copy = "+(elapsedTime));
        System.out.println("Time 1 taken by Stream Copy in seconds = "+(elapsedTimeInSecond));
        System.out.println("Time 1 taken by Stream Copy in seconds = "+(elapsedTimeInSecond2));
        
        //copy files using java.nio FileChannel
        dest = new File("C:/Java/arquivosteste/video3.mp4");
        start = System.nanoTime();
        copyFileUsingChannel(source, dest);
        elapsedTime = System.nanoTime()-start;
        elapsedTimeInSecond = (double) elapsedTime / 1000000000;
        elapsedTimeInSecond2 = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        System.out.println("Time 2 taken by Channel Copy = "+(elapsedTime));
        System.out.println("Time 2 taken by Channel Copy in seconds = "+(elapsedTimeInSecond));
        System.out.println("Time 2 taken by Channel Copy in seconds = "+(elapsedTimeInSecond2));
        
        //using Java 7 Files class
        dest = new File("C:/Java/arquivosteste/video4.mp4");
        start = System.nanoTime();
        copyFileUsingJava7Files(source, dest);
//        Thread.sleep(5000);
        elapsedTime = System.nanoTime()-start;
        elapsedTimeInSecond = (double) elapsedTime / 1000000000;
        elapsedTimeInSecond2 = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        System.out.println("Time taken by Java7 Files Copy = "+(elapsedTime));
        System.out.println("Time taken by Java7 Files Copy in seconds  = "+(elapsedTimeInSecond));
        System.out.println("Time taken by Java7 Files Copy in seconds  = "+(elapsedTimeInSecond2));

    }
}
