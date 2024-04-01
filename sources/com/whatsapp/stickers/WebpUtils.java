package com.whatsapp.stickers;

import X.AnonymousClass024;
import X.C000200d;
import X.C000700j;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* loaded from: classes.dex */
public class WebpUtils {
    public static final Random A00 = new Random();

    public static native boolean createFirstThumbnail(byte[] bArr, int i, String str);

    public static native byte[] fetchWebpMetadata(String str);

    public static native int getFirstWebpThumbnailMinimumFileLength(String str);

    public static native boolean insertWebpMetadata(String str, String str2, byte[] bArr);

    public static native WebpInfo verifyWebpFileIntegrity(String str);

    public static String A00(String str) {
        int i;
        C000700j.A00();
        File file = new File(str);
        if (!file.exists()) {
            C000200d.A13("WebpUtils/getFileHashExcludingMetadata/file does not exist, ", str);
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[4];
            byte[] bArr2 = new byte[4];
            bufferedInputStream.skip(8L);
            boolean z = true;
            int i2 = 0;
            boolean z2 = true;
            int i3 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byte b = bArr[0];
                if (b == 69 && bArr[1] == 88 && bArr[2] == 73 && bArr[3] == 70) {
                    i3 = 4;
                } else {
                    byte b2 = bArr2[3];
                    if (b2 != 69 || b != 88 || bArr[1] != 73 || bArr[2] != 70) {
                        byte b3 = bArr2[2];
                        if (b3 == 69 && b2 == 88 && b == 73 && bArr[1] == 70) {
                            i3 = 2;
                        } else if (bArr2[1] == 69 && b3 == 88 && b2 == 73 && b == 70) {
                            i3 = 1;
                        }
                    } else {
                        i3 = 3;
                    }
                }
                if (z2) {
                    i = 4;
                    if (i3 == 4) {
                        break;
                    }
                } else if (i3 > 0) {
                    messageDigest.update(bArr2, 0, i3);
                    break;
                } else {
                    messageDigest.update(bArr2, 0, i2);
                    i = 4;
                }
                System.arraycopy(bArr, 0, bArr2, 0, i);
                i2 = read;
                z2 = false;
            }
            z = false;
            if (!z) {
                messageDigest.update(bArr2, 0, i2);
            }
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            bufferedInputStream.close();
            return encodeToString;
        } catch (FileNotFoundException e) {
            StringBuilder sb = new StringBuilder("WebpUtils/getFileHashExcludingMetadata/file not found:");
            sb.append(str);
            Log.e(sb.toString(), e);
            return null;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder("WebpUtils/getFileHashExcludingMetadata/io exception, file path:");
            sb2.append(str);
            Log.e(sb2.toString(), e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            Log.e("WebpUtils/getFileHashExcludingMetadata/no such algorithms exception", e3);
            return null;
        }
    }

    public static boolean A01(File file, byte[] bArr) {
        if (file.exists()) {
            if (bArr == null || bArr.length == 0) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            sb.append(".");
            sb.append(A00.nextLong());
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            try {
                new String(bArr, "UTF-8");
                boolean insertWebpMetadata = insertWebpMetadata(file.getAbsolutePath(), file2.getAbsolutePath(), bArr);
                file.getAbsolutePath();
                if (insertWebpMetadata) {
                    boolean renameTo = file2.renameTo(file);
                    file2.getAbsolutePath();
                    file.getAbsolutePath();
                    return renameTo;
                }
                return false;
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("WebpUtils/insertWebpMetadata/error when converting bytes to string, input file:");
                sb2.append(file);
                Log.e(sb2.toString(), e);
                return false;
            } finally {
                AnonymousClass024.A0f(file2);
            }
        }
        return false;
    }
}
