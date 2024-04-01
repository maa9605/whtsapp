package X;

import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Locale;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.02A */
/* loaded from: classes.dex */
public class C02A {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static String A03;
    public static final byte[] A05 = {0, 2};
    public static final C00J A04 = C007203d.A00(new InterfaceC007103c() { // from class: X.1n6
        @Override // X.InterfaceC007103c
        public final Object get() {
            try {
                Class.forName("androidx.test.espresso.Espresso");
                return Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                return Boolean.FALSE;
            }
        }
    });

    public static String A00() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/sys/kernel/osrelease"));
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
            try {
                sb.append(bufferedReader.readLine());
                bufferedReader.close();
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (IOException unused) {
            sb.append("Unknown release");
        }
        try {
            try {
                bufferedReader2 = new BufferedReader(new FileReader("/proc/sys/kernel/version"));
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
            }
        } catch (IOException unused2) {
            sb.append(" unknown version");
        }
        try {
            sb.append(' ');
            sb.append(bufferedReader2.readLine());
            bufferedReader2.close();
            return sb.toString();
        } catch (Throwable th4) {
            th = th4;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public static String A01(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return A04(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String A02(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return A04(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A03(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            cArr2[i] = cArr[i2 >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public static String A04(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >>> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static SecretKey A05(byte[] bArr, byte[] bArr2, int i, int i2) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i3] = (char) bArr[i3];
        }
        try {
            try {
                return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1And8BIT").generateSecret(new PBEKeySpec(cArr, bArr2, i, i2));
            } catch (InvalidKeySpecException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void A06(Context context) {
        new File(context.getFilesDir(), "rc2").delete();
    }

    public static void A07(byte[] bArr, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bArr);
            objectOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static boolean A08() {
        String str = A03;
        if (str == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = Build.VERSION.RELEASE;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = Build.DISPLAY;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = Build.MODEL;
            if (str5 == null) {
                str5 = "";
            }
            String A002 = A00();
            str = "cyanogen";
            if (!A002.toLowerCase(Locale.US).contains("cyanogen")) {
                if (!str2.toLowerCase(Locale.US).contains("debug") && !str3.toLowerCase(Locale.US).contains("debug") && !str4.toLowerCase(Locale.US).contains("debug") && !str5.toLowerCase(Locale.US).contains("debug") && !A002.toLowerCase(Locale.US).contains("debug")) {
                    if (str4.startsWith("Darky")) {
                        str = "darky";
                    } else if (str2.startsWith("XDAndroid")) {
                        str = "xdandroid";
                    } else if (str3.startsWith("FroydVillain")) {
                        str = "froydvillain";
                    } else if (str3.startsWith("VillainROM") || str4.startsWith("VillainROM")) {
                        str = "villainrom";
                    } else if (str3.startsWith("WildPuzzle")) {
                        str = "wildpuzzle";
                    } else if (str4.startsWith("MIUI")) {
                        str = "miui";
                    } else if (str4.startsWith("ITFUNZ")) {
                        str = "itfunz";
                    } else if (str4.startsWith("DebusROM")) {
                        str = "debus";
                    } else if (str4.startsWith("FreeX10")) {
                        str = "freex10";
                    } else if (str4.startsWith("Perception Build")) {
                        str = "perception";
                    } else if (str4.startsWith("Bionix")) {
                        str = "bionix";
                    } else if (str4.startsWith("Lite'ning Rom")) {
                        str = "litening";
                    } else if (str4.startsWith("GINGERVillain")) {
                        str = "gingervillian";
                    } else if (str4.startsWith("GingerReal")) {
                        str = "gingerreal";
                    } else if (str4.startsWith("R.U.R.1920")) {
                        str = "rur1920";
                    } else if (str5.startsWith("MoDaCo")) {
                        str = "modaco";
                    } else if (str4.startsWith("CriskeloROM")) {
                        str = "criskelorom";
                    } else if (str4.startsWith("LeeDrOiD")) {
                        str = "leedroid";
                    } else if (str4.startsWith("Dexter's FolioMod")) {
                        str = "foliomod";
                    } else if (str4.startsWith("Andro-ID")) {
                        str = "andro-id";
                    } else if (str4.startsWith("FroyoPlus")) {
                        str = "froyoplus";
                    } else if (str4.startsWith("PilotxRom")) {
                        str = "pilotx";
                    } else if (str4.startsWith("Achotjan")) {
                        str = "achotjan";
                    } else if (A002.contains("FuguMod")) {
                        str = "fugu";
                    } else if (A002.contains("fakeShmoo")) {
                        str = "fakeshmoo";
                    } else if (A002.contains("LorDmodNCTeam")) {
                        str = "lordmod";
                    } else if (A002.contains("-RCMIX")) {
                        str = "rcmix";
                    } else {
                        str = str4.contains("DamianGTO") ? "damiangto" : "";
                    }
                } else {
                    str = "debug";
                }
            }
            C000200d.A14("app/custom-rom ", str);
            A03 = str;
        }
        return str.length() != 0;
    }

    public static boolean A09(Context context, byte[] bArr, String str) {
        new String(bArr);
        File file = new File(context.getFilesDir(), "rc2");
        String A0L = C000200d.A0L(new StringBuilder(), C0FH.A0I, str);
        byte[] bArr2 = A05;
        boolean z = false;
        try {
            byte[] A0C = A0C(4);
            byte[] A0C2 = A0C(16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(A05(A0L.getBytes(), A0C, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
            Cipher cipher = Cipher.getInstance("AES/OFB/NoPadding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(A0C2));
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] bArr3 = new byte[bArr2.length + A0C.length + A0C2.length + doFinal.length];
            byte[][] bArr4 = {bArr2, A0C, A0C2, doFinal};
            int i = 0;
            int i2 = 0;
            do {
                byte[] bArr5 = bArr4[i];
                System.arraycopy(bArr5, 0, bArr3, i2, bArr5.length);
                i2 += bArr5.length;
                i++;
            } while (i < 4);
            A07(bArr3, file);
            z = Arrays.equals(bArr3, A0F(file));
            return z;
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("unable to write ");
            A0P.append(file.toString());
            Log.e(A0P.toString(), e);
            return z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00b6, code lost:
        if (r10.A0G() == null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0A(X.C02E r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02A.A0A(X.02E):boolean");
    }

    public static byte[] A0B() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(160, SecureRandom.getInstance("SHA1PRNG"));
            return keyGenerator.generateKey().getEncoded();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A0C(int i) {
        try {
            byte[] bArr = new byte[i];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A0D(Context context) {
        try {
            ZipFile zipFile = new ZipFile(context.getPackageCodePath());
            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry("classes.dex"));
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    byte[] digest = messageDigest.digest();
                    inputStream.close();
                    zipFile.close();
                    return digest;
                }
            }
        } catch (Exception e) {
            Log.e("app/md5/bytes/error ", e);
            try {
                return "null".getBytes("UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new Error(e2);
            }
        }
    }

    public static byte[] A0E(Context context, String str) {
        try {
            File file = new File(context.getFilesDir(), "rc2");
            StringBuilder sb = new StringBuilder();
            sb.append(C0FH.A0I);
            sb.append(str);
            String obj = sb.toString();
            byte[] bArr = A05;
            byte[] A0F = A0F(file);
            if (A0F != null) {
                try {
                    int length = A0F.length;
                    int length2 = bArr.length;
                    if (length >= length2 + 4 + 16 + 20) {
                        byte[] bArr2 = new byte[length2];
                        System.arraycopy(A0F, 0, bArr2, 0, length2);
                        int i = length2 + 0;
                        if (Arrays.equals(bArr2, bArr)) {
                            byte[] bArr3 = new byte[4];
                            System.arraycopy(A0F, i, bArr3, 0, 4);
                            int i2 = i + 4;
                            byte[] bArr4 = new byte[16];
                            System.arraycopy(A0F, i2, bArr4, 0, 16);
                            int i3 = i2 + 16;
                            SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(A05(obj.getBytes(), bArr3, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
                            Cipher cipher = Cipher.getInstance("AES/OFB/NoPadding");
                            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                            return cipher.doFinal(A0F, i3, length - i3);
                        }
                        throw new C03840Hi();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file.toString());
                    sb2.append(" size mismatch");
                    throw new InvalidParameterException(sb2.toString());
                } catch (Exception e) {
                    file.delete();
                    if (e instanceof C03840Hi) {
                        throw e;
                    }
                    throw new RuntimeException(e);
                }
            }
            return null;
        } catch (C03840Hi e2) {
            Log.w("recovery token header mismatch", e2);
            return null;
        }
    }

    public static byte[] A0F(File file) {
        if (!file.exists() || file.length() <= 0) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                byte[] bArr = (byte[]) objectInputStream.readObject();
                fileInputStream.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        objectInputStream.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Exception e) {
            Log.w("get byte array", e);
            return null;
        }
    }

    public static byte[] A0G(byte[] bArr, byte[]... bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(bArr, "HmacSHA1"));
            for (byte[] bArr3 : bArr2) {
                mac.update(bArr3);
            }
            return mac.doFinal();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
