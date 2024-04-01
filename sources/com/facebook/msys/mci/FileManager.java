package com.facebook.msys.mci;

import X.C003601s;
import X.C07K;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public class FileManager {
    public static final String CACHE_SCHEMA = "cache://";
    public static final String FILE_SCHEMA = "file://";
    public static final String TAG = "FileManager";
    public static File mCacheDir;
    public static boolean sInitialized;

    public static native void nativeInitialize();

    /* JADX WARN: Finally extract failed */
    public static boolean copyFile(String str, String str2) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
        if (fileFromPathWithOptionalScheme2.exists()) {
            return false;
        }
        tryToCreateDirectoryOfFile(str2);
        try {
            FileInputStream fileInputStream = new FileInputStream(fileFromPathWithOptionalScheme);
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromPathWithOptionalScheme2);
            try {
                copyInputStreamIntoOutputStream(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static boolean createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if (fileFromPathWithOptionalScheme.exists() && fileFromPathWithOptionalScheme.isDirectory()) {
            return true;
        }
        return fileFromPathWithOptionalScheme.mkdirs();
    }

    public static boolean deleteItem(String str) {
        return deleteItemRecursive(getFileFromPathWithOptionalScheme(str));
    }

    public static boolean deleteItemRecursive(File file) {
        File[] listFiles;
        if (file.isDirectory()) {
            boolean z = true;
            for (File file2 : file.listFiles()) {
                z = !file2.isDirectory() ? !(z && file2.delete()) : !(z && deleteItemRecursive(file2));
            }
            return file.delete() && z;
        }
        return file.delete();
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        synchronized (FileManager.class) {
            if (str.startsWith(FILE_SCHEMA)) {
                try {
                    return new File(new URI(str));
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            } else if (str.startsWith(CACHE_SCHEMA)) {
                return new File(mCacheDir, str.substring(8));
            } else {
                return new File(str);
            }
        }
    }

    public static synchronized boolean initialize(File file) {
        synchronized (FileManager.class) {
            C003601s.A01("FileManager.initialize");
            if (sInitialized) {
                C003601s.A00();
                return false;
            }
            mCacheDir = file;
            nativeInitialize();
            sInitialized = true;
            C003601s.A00();
            return true;
        }
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = listFiles[i].getAbsolutePath();
            }
            return strArr;
        }
        return null;
    }

    public static boolean moveFile(String str, String str2) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
        if (fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2) || fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
            return true;
        }
        if (copyFile(str, str2)) {
            return fileFromPathWithOptionalScheme.delete();
        }
        return false;
    }

    public static byte[] readFile(String str) {
        try {
            return C07K.A1p(getFileFromPathWithOptionalScheme(str));
        } catch (IOException unused) {
            return null;
        }
    }

    public static void tryToCreateDirectoryOfFile(String str) {
        File parentFile = getFileFromPathWithOptionalScheme(str).getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    /* JADX WARN: Finally extract failed */
    public static boolean writeDataToFile(byte[] bArr, String str) {
        tryToCreateDirectoryOfFile(str);
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromPathWithOptionalScheme);
            try {
                copyInputStreamIntoOutputStream(byteArrayInputStream, fileOutputStream);
                fileOutputStream.close();
                byteArrayInputStream.close();
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
