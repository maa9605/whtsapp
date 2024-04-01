package X;

/* renamed from: X.1sq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40771sq {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String A00(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            byte b = bArr[0 + i];
            stringBuffer.append("(byte)0x");
            char[] cArr = A00;
            stringBuffer.append(cArr[(b >> 4) & 15]);
            stringBuffer.append(cArr[b & 15]);
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }
}
