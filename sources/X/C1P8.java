package X;

import android.util.Pair;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.List;

/* renamed from: X.1P8  reason: invalid class name */
/* loaded from: classes.dex */
public class C1P8 {
    public static final InetSocketAddress A00;
    public static final InetSocketAddress A01;

    static {
        try {
            A00 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 8, 8}), 53);
            A01 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 4, 4}), 53);
        } catch (UnknownHostException e) {
            throw new Error(e);
        }
    }

    public static Pair A00(byte[] bArr, int i) {
        int length;
        if (i >= 0 && i < (length = bArr.length)) {
            int i2 = -1;
            CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            newDecoder.onMalformedInput(codingErrorAction);
            newDecoder.onUnmappableCharacter(codingErrorAction);
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i3 = bArr[i];
                int i4 = i + 1;
                if (((i3 >> 6) & 3) == 3) {
                    int i5 = (i3 & 63) << 8;
                    if (i4 < length) {
                        i2 = i5 + bArr[i4];
                    } else {
                        throw new UnknownHostException("offset is outside of the data array, when getting a pointer");
                    }
                } else if (i3 == 0) {
                    break;
                } else {
                    i = i4 + i3;
                    if (i < length) {
                        try {
                            sb.append(newDecoder.decode(ByteBuffer.wrap(bArr, i4, i3)).toString());
                            sb.append(".");
                        } catch (CharacterCodingException unused) {
                            throw new UnknownHostException("failed to parse canonical name");
                        }
                    } else {
                        throw new UnknownHostException("failed to parse canonical name");
                    }
                }
            }
            return new Pair(sb, Integer.valueOf(i2));
        }
        throw new UnknownHostException("offset is outside of the data array");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x022f, code lost:
        if (r2.getMessage().contains("libcore.io.ErrnoException: connect failed: EINVAL") == false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List A01(java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1P8.A01(java.lang.String, int):java.util.List");
    }

    public static void A02(String str, int i, C60572uh c60572uh, byte[] bArr, List list, C60572uh c60572uh2) {
        short A002;
        C60562ug c60562ug = c60572uh2.A01;
        if (c60562ug.A01 == c60572uh.A01.A01) {
            if (c60562ug.A0A) {
                if (!c60562ug.A0B) {
                    if (c60562ug.A06 == 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C60552uf c60552uf = null;
                        int i2 = 0;
                        while (true) {
                            C60552uf[] c60552ufArr = c60572uh2.A02;
                            if (i2 < c60552ufArr.length) {
                                C60552uf c60552uf2 = c60552ufArr[i2];
                                if (c60552uf2.A03 == 1) {
                                    short s = c60552uf2.A04;
                                    if (s == 5) {
                                        c60552uf = c60552uf2;
                                    } else if (s != 1 && s != 28) {
                                        throw new UnknownHostException(C000200d.A0H("unexpected type returned while trying to resolve ", str));
                                    } else {
                                        if (c60552uf2.A04 != 1 || c60552uf2.A00() == 4) {
                                            if (c60552uf2.A04 == 28 && (A002 = c60552uf2.A00()) != 16) {
                                                StringBuilder A0W = C000200d.A0W("unexpected record length returned while trying to resolve ", str, " ");
                                                A0W.append((int) A002);
                                                throw new UnknownHostException(A0W.toString());
                                            }
                                            C60582ui c60582ui = c60552uf2.A02;
                                            StringBuilder sb = new StringBuilder();
                                            for (String str2 : c60582ui.A02) {
                                                sb.append(str2);
                                                sb.append('.');
                                            }
                                            short s2 = c60582ui.A01;
                                            if (s2 != 0) {
                                                for (String str3 : C60582ui.A00(c60572uh2.A00, 0 + s2).A02) {
                                                    sb.append(str3);
                                                    sb.append('.');
                                                }
                                            }
                                            if (sb.length() > 0) {
                                                sb.setLength(sb.length() - 1);
                                            }
                                            list.add(new C1P7(InetAddress.getByAddress(sb.toString(), c60552uf2.A05), (c60552uf2.A01 * 1000) + currentTimeMillis));
                                            list.get(list.size() - 1);
                                        } else {
                                            throw new UnknownHostException(C000200d.A0H("unexpected record length returned while trying to resolve ", str));
                                        }
                                    }
                                    i2++;
                                } else {
                                    throw new UnknownHostException(C000200d.A0H("unexpected class returned while trying to resolve ", str));
                                }
                            } else if (!list.isEmpty() || c60552uf == null) {
                                return;
                            } else {
                                Pair A003 = A00(c60552uf.A05, 0);
                                StringBuilder sb2 = (StringBuilder) A003.first;
                                int intValue = ((Number) A003.second).intValue();
                                if (intValue != -1) {
                                    sb2.append((CharSequence) A00(bArr, intValue).first);
                                }
                                String obj = sb2.toString();
                                if (obj.equals(str)) {
                                    return;
                                }
                                list.addAll(A01(obj, i + 1));
                                return;
                            }
                        }
                    } else {
                        throw new UnknownHostException(C000200d.A0H("error code was set in response while trying to resolve ", str));
                    }
                } else {
                    throw new UnknownHostException(C000200d.A0H("received truncated response while trying to resolve ", str));
                }
            } else {
                throw new UnknownHostException(C000200d.A0H("did not receive response from server while trying to resolve ", str));
            }
        } else {
            throw new UnknownHostException(C000200d.A0H("received response with unexpected id while trying to resolve ", str));
        }
    }
}
