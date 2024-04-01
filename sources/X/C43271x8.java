package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1x8 */
/* loaded from: classes2.dex */
public class C43271x8 {
    public String A01;
    public C55392kL A05;
    public C43281x9 A06;
    public List A04 = new ArrayList();
    public int A00 = 0;
    public String A02 = "UTF-8";
    public String A03 = "UTF-8";

    public void A00(String str) {
        String str2 = this.A01;
        if (str2 != null && !str2.equalsIgnoreCase("TYPE")) {
            this.A05.A00.put(str2, str);
        } else {
            this.A05.A04.add(str);
        }
        this.A01 = null;
    }

    public void A01(List list) {
        byte[] bytes;
        byte[] byteArray;
        String str = "";
        if (list != null && list.size() != 0) {
            String asString = this.A05.A00.getAsString("ENCODING");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C55392kL c55392kL = this.A05;
                List list2 = c55392kL.A03;
                if (asString != null) {
                    if (!asString.equals("BASE64") && !asString.equals("B")) {
                        if (asString.equals("QUOTED-PRINTABLE")) {
                            String replaceAll = str2.replaceAll("= ", " ").replaceAll("=\t", "\t");
                            StringBuilder sb = new StringBuilder();
                            int length = replaceAll.length();
                            ArrayList arrayList = new ArrayList();
                            int i = 0;
                            while (i < length) {
                                char charAt = replaceAll.charAt(i);
                                if (charAt == '\n') {
                                    arrayList.add(sb.toString());
                                    sb = new StringBuilder();
                                } else if (charAt == '\r') {
                                    arrayList.add(sb.toString());
                                    sb = new StringBuilder();
                                    if (i < length - 1) {
                                        int i2 = i + 1;
                                        if (replaceAll.charAt(i2) == '\n') {
                                            i = i2;
                                        }
                                    }
                                } else {
                                    sb.append(charAt);
                                }
                                i++;
                            }
                            String obj = sb.toString();
                            if (obj.length() > 0) {
                                arrayList.add(obj);
                            }
                            String[] strArr = (String[]) arrayList.toArray(new String[0]);
                            StringBuilder sb2 = new StringBuilder();
                            for (String str3 : strArr) {
                                if (str3.endsWith("=")) {
                                    str3 = str3.substring(0, str3.length() - 1);
                                }
                                sb2.append(str3);
                            }
                            try {
                                bytes = sb2.toString().getBytes("UTF-8");
                            } catch (UnsupportedEncodingException e) {
                                StringBuilder A0P = C000200d.A0P("Failed to encode: charset=");
                                A0P.append("UTF-8");
                                Log.e(A0P.toString(), e);
                                bytes = sb2.toString().getBytes();
                            }
                            if (bytes == null) {
                                byteArray = null;
                            } else {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    int i3 = 0;
                                    while (i3 < bytes.length) {
                                        byte b = bytes[i3];
                                        if (b == 61) {
                                            int i4 = i3 + 1;
                                            try {
                                                byte b2 = bytes[i4];
                                                int digit = Character.digit((char) b2, 16);
                                                if (digit != -1) {
                                                    i3 = i4 + 1;
                                                    byte b3 = bytes[i3];
                                                    int digit2 = Character.digit((char) b3, 16);
                                                    if (digit2 != -1) {
                                                        byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                                                    } else {
                                                        throw new C75883fh(C000200d.A0D("Invalid URL encoding: not a valid digit (radix 16): ", b3));
                                                    }
                                                } else {
                                                    throw new C75883fh(C000200d.A0D("Invalid URL encoding: not a valid digit (radix 16): ", b2));
                                                }
                                            } catch (ArrayIndexOutOfBoundsException e2) {
                                                throw new C75883fh(e2);
                                            }
                                        } else {
                                            byteArrayOutputStream.write(b);
                                        }
                                        i3++;
                                    }
                                    byteArray = byteArrayOutputStream.toByteArray();
                                } catch (C75883fh e3) {
                                    Log.e("Failed to decode quoted-printable: ", e3);
                                    str2 = "";
                                }
                            }
                            try {
                                str2 = new String(byteArray, "UTF-8");
                            } catch (UnsupportedEncodingException e4) {
                                Log.e("Failed to encode: charset=UTF-8", e4);
                                str2 = new String(byteArray);
                            }
                        }
                    } else {
                        c55392kL.A06 = Base64.decode(str2.getBytes(), 0);
                    }
                    list2.add(str2);
                }
                if (!"UTF-8".equalsIgnoreCase("UTF-8")) {
                    ByteBuffer encode = Charset.forName("UTF-8").encode(str2);
                    byte[] bArr = new byte[encode.remaining()];
                    encode.get(bArr);
                    try {
                        str2 = new String(bArr, "UTF-8");
                    } catch (UnsupportedEncodingException e5) {
                        Log.e("Failed to encode: charset=UTF-8", e5);
                        str2 = new String(bArr);
                    }
                }
                list2.add(str2);
            }
            C55392kL c55392kL2 = this.A05;
            List<String> list3 = c55392kL2.A03;
            int size = list3.size();
            if (size > 1) {
                StringBuilder sb3 = new StringBuilder();
                for (String str4 : list3) {
                    sb3.append(str4);
                    sb3.append(";");
                }
                int length2 = sb3.length();
                if (length2 > 0) {
                    int i5 = length2 - 1;
                    if (sb3.charAt(i5) == ';') {
                        str = sb3.substring(0, i5);
                    }
                }
                str = sb3.toString();
            } else if (size == 1) {
                str = (String) list3.get(0);
            }
            c55392kL2.A02 = str;
            return;
        }
        C55392kL c55392kL3 = this.A05;
        c55392kL3.A06 = null;
        c55392kL3.A03.clear();
        this.A05.A03.add("");
        this.A05.A02 = "";
    }
}
