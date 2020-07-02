package com.hdr.nio;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZeroCopyDemo {

	public static void main(String[] args) throws IOException {
		final String sourcePath = "/home/hdr/Download/ideaIU-2020.1.1.tar.gz";
		String sinkPath = "/home/hdr/Download/ideaIU-2020.1.1.tar.gz.sink";

		try (FileChannel srcCh = new FileInputStream(sourcePath).getChannel();
		     FileChannel sinkCh = new FileOutputStream(sinkPath).getChannel()) {
			long position = 0;
			long size = srcCh.size();

			long start = System.currentTimeMillis();
			long n = srcCh.transferTo(position, size, sinkCh);
			System.out.println("zero copy : " + (System.currentTimeMillis() - start));
		}

		sinkPath = "/home/hdr/Download/ideaIU-2020.1.1.tar.gz.sink2";
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
		     BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(sinkPath))) {

			int len;
			byte[] buffer = new byte[1024];

			long start = System.currentTimeMillis();
			while ((len = bis.read(buffer)) > 0) {
				bos.write(buffer, 0, len);
			}
			System.out.println("normal copy : " + (System.currentTimeMillis() - start));
		}

		sinkPath = "/home/hdr/Download/ideaIU-2020.1.1.tar.gz.sink3";
		try (FileOutputStream fos = new FileOutputStream(sinkPath)) {
			Path source = Paths.get(sourcePath);
			long start = System.currentTimeMillis();
			Files.copy(source, fos);
			System.out.println("Files.copy : " + (System.currentTimeMillis() - start));
		}

	}

}
