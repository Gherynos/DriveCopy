/**
 * Copyright 2012 Luca Zanconato
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.nharyes.drivecopy.biz.bo;

import java.io.File;

public class FileBO implements BusinessObject {

	private File file;
	
	private String name;
	
	private int compressionLevel;
	
	private boolean isDirectory;
	
	private boolean deleteAfter;

	public File getFile() {
		
		return file;
	}

	public void setFile(File file) {
		
		this.file = file;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public int getCompressionLevel() {
		
		return compressionLevel;
	}

	public void setCompressionLevel(int compressionLevel) {
		
		this.compressionLevel = compressionLevel;
	}

	public boolean isDirectory() {
		
		return isDirectory;
	}

	public void setDirectory(boolean isDirectory) {
		
		this.isDirectory = isDirectory;
	}

	public boolean isDeleteAfter() {
		
		return deleteAfter;
	}

	public void setDeleteAfter(boolean deleteAfter) {
		
		this.deleteAfter = deleteAfter;
	}
}