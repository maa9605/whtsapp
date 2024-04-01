package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0Fu */
/* loaded from: classes.dex */
public class C03460Fu {
    public static final byte[] A01 = {0, 1};
    public static final byte[] A02 = {0, 2};
    public static final byte[] A00 = {0, 1};

    public static int A00(String str, String str2) {
        if (str2.equals(str)) {
            return 0;
        }
        if (str.endsWith(".crypt")) {
            return 1;
        }
        String[] split = str.split(".crypt");
        if (split.length != 2) {
            C000200d.A13("msgstore/get-version/unexpected-filename ", str);
            return -1;
        }
        try {
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/get-version/unexpected-filename ");
            sb.append(str);
            Log.e(sb.toString(), e);
            return -1;
        }
    }

    public static C03780Ha A01(InputStream inputStream) {
        int length = A00.length;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[length + 1 + 32 + 16 + 16];
        inputStream.read(bArr5);
        System.arraycopy(bArr5, 0, bArr, 0, length);
        int i = length + 0;
        if (!Arrays.equals(bArr, A02) && !Arrays.equals(bArr, A01)) {
            throw new C03840Hi();
        }
        int i2 = i + 1;
        String valueOf = String.valueOf((int) bArr5[i]);
        byte[][] bArr6 = {bArr2, bArr3, bArr4};
        int i3 = 0;
        do {
            byte[] bArr7 = bArr6[i3];
            System.arraycopy(bArr5, i2, bArr7, 0, bArr7.length);
            i2 += bArr7.length;
            i3++;
        } while (i3 < 3);
        return new C03780Ha(bArr, valueOf, bArr2, bArr3, bArr4);
    }

    public static C03780Ha A02(InputStream inputStream) {
        C87083z5 A09 = C87083z5.A09(inputStream);
        if (A09.A0j() == EnumC79083l3.WA_PROVIDED) {
            C87123z9 A0l = A09.A0l();
            return new C03780Ha(A0l.A01.A06(), A0l.A05, A0l.A04.A06(), A0l.A03.A06(), A0l.A02.A06());
        }
        return null;
    }

    public static C0HZ A03(Context context) {
        File file = new File(context.getFilesDir(), "key");
        if (!file.exists()) {
            Log.w("backupkey/getinfo/does-not-exist");
            return null;
        }
        byte[] A0F = C02A.A0F(file);
        if (A0F != null) {
            int length = A0F.length;
            byte[] bArr = A00;
            int length2 = bArr.length;
            if (length >= length2 + 1 + 32 + 16 + 32 + 16 + 32) {
                byte[] bArr2 = new byte[length2];
                System.arraycopy(A0F, 0, bArr2, 0, length2);
                int i = length2 + 0;
                if (Arrays.equals(bArr2, bArr)) {
                    int i2 = i + 1;
                    String valueOf = String.valueOf((int) A0F[i]);
                    byte[] bArr3 = new byte[32];
                    System.arraycopy(A0F, i2, bArr3, 0, 32);
                    int i3 = i2 + 32;
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(A0F, i3, bArr4, 0, 16);
                    int i4 = i3 + 16;
                    byte[] bArr5 = new byte[32];
                    System.arraycopy(A0F, i4, bArr5, 0, 32);
                    byte[] A0C = C02A.A0C(16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(A0F, i4 + 32 + 16, bArr6, 0, 32);
                    C0HZ c0hz = new C0HZ(bArr2, valueOf, bArr3, bArr4, bArr5, A0C, bArr6);
                    c0hz.toString();
                    return c0hz;
                }
                throw new C03840Hi();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(file.toString());
            sb.append(" size mismatch");
            throw new InvalidParameterException(sb.toString());
        }
        return null;
    }

    public static ArrayList A04(File file, List list) {
        File[] listFiles;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList arrayList = new ArrayList();
        String pattern = simpleDateFormat.toPattern();
        String A09 = C003101m.A09(file.getName());
        String A0C = C003101m.A0C(file.getName(), "");
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = C003101m.A0C(file.getName(), (String) list.get(i));
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && (listFiles = parentFile.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(A09)) {
                    boolean endsWith = name.endsWith(A0C);
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            String str = strArr[i2];
                            if (endsWith) {
                                break;
                            }
                            endsWith = name.endsWith(str);
                            i2++;
                        } else if (!endsWith) {
                        }
                    }
                    if (name.length() > pattern.length() + A09.length()) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append((String) it.next());
            File file3 = new File(sb.toString());
            if (file3.exists()) {
                arrayList.add(file3);
            }
        }
        arrayList.toString();
        Collections.sort(arrayList, new C27331My(A09, simpleDateFormat));
        return arrayList;
    }

    public static List A05(EnumC03450Ft enumC03450Ft, EnumC03450Ft enumC03450Ft2) {
        if (enumC03450Ft.version <= enumC03450Ft2.version) {
            EnumC03450Ft[] A04 = EnumC03450Ft.A04(enumC03450Ft, enumC03450Ft2);
            ArrayList arrayList = new ArrayList(A04.length);
            for (EnumC03450Ft enumC03450Ft3 : A04) {
                StringBuilder A0P = C000200d.A0P(".crypt");
                A0P.append(enumC03450Ft3.version);
                arrayList.add(A0P.toString());
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder("msgstore/get-db-crypt-extension-range/illegal-range [");
        sb.append(enumC03450Ft);
        sb.append(", ");
        sb.append(enumC03450Ft2);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void A06(Context context) {
        new File(context.getFilesDir(), "key").delete();
    }

    public static void A07(Context context, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        Arrays.toString(bArr);
        Arrays.toString(bArr2);
        File file = new File(context.getFilesDir(), "key");
        byte[] bArr5 = new byte[16];
        Arrays.toString(bArr5);
        byte[] bArr6 = {Byte.parseByte(str)};
        byte[] bArr7 = A00;
        byte[] bArr8 = new byte[bArr7.length + 1 + bArr.length + bArr4.length + bArr3.length + 16 + bArr2.length];
        byte[][] bArr9 = {bArr7, bArr6, bArr, bArr4, bArr3, bArr5, bArr2};
        int i = 0;
        int i2 = 0;
        do {
            byte[] bArr10 = bArr9[i];
            System.arraycopy(bArr10, 0, bArr8, i2, bArr10.length);
            i2 += bArr10.length;
            i++;
        } while (i < 7);
        Arrays.toString(bArr8);
        try {
            C02A.A07(bArr8, file);
            byte[] A0F = C02A.A0F(file);
            A03(context);
            Arrays.equals(bArr8, A0F);
        } catch (Exception e) {
            Log.e("backupkey/set/unable-to-write ", e);
        }
    }

    public static void A08(AbstractC000600i abstractC000600i, byte[] bArr) {
        int length = bArr.length;
        if (length != 32) {
            StringBuilder A0P = C000200d.A0P("");
            A0P.append(length);
            abstractC000600i.A09("crypto-iq-incorrect-account-hash-size", A0P.toString(), true);
        }
    }

    public static void A09(AbstractC000600i abstractC000600i, byte[] bArr) {
        int length = bArr.length;
        if (length != 16) {
            StringBuilder A0P = C000200d.A0P("");
            A0P.append(length);
            abstractC000600i.A09("crypto-iq-incorrect-account-salt-size", A0P.toString(), true);
        }
    }

    public static void A0A(File file) {
        if (file.exists()) {
            try {
                file.renameTo(new File(file.getParentFile(), C003101m.A08(file, new Date(), "")));
            } catch (SecurityException unused) {
            }
        }
    }

    public static void A0B(FileChannel fileChannel, WritableByteChannel writableByteChannel) {
        for (long j = 0; j < fileChannel.size(); j += 131072) {
            fileChannel.transferTo(j, Math.min(131072L, fileChannel.size() - j), writableByteChannel);
        }
    }

    public static void A0C(ArrayList arrayList, File file) {
        Collections.sort(arrayList, new C27331My(C003101m.A09(file.getName()), new SimpleDateFormat("yyyy-MM-dd", Locale.US)));
    }

    public static boolean A0D(Context context) {
        return !new File(context.getFilesDir(), "key").exists();
    }

    public static boolean A0E(C87083z5 c87083z5, String str) {
        if ((c87083z5.A00 & 8) == 8) {
            C87063z3 A0i = c87083z5.A0i();
            if ((A0i.A00 & 4) == 4) {
                String str2 = A0i.A03;
                if (!TextUtils.isEmpty(str2) && !str.endsWith(str2)) {
                    StringBuilder sb = new StringBuilder("EncBackupUtils/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(" actual-jid-user: ");
                    sb.append(str);
                    Log.e(sb.toString());
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] A0F(byte[] bArr) {
        MessageDigest messageDigest;
        Arrays.toString(bArr);
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("calculateahash/digester ", e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            Log.e("calculateahash/digester is null");
            return null;
        }
        messageDigest.reset();
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
