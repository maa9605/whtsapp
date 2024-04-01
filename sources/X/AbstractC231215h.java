package X;

import android.util.Base64;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.15h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC231215h {
    public abstract Object A04(String str);

    public abstract Map A05();

    public abstract boolean A06(String str);

    public static Object A00(C31211bt c31211bt, Object obj) {
        InterfaceC231115g interfaceC231115g = c31211bt.A00;
        if (interfaceC231115g != null) {
            C31191br c31191br = (C31191br) interfaceC231115g;
            if (c31191br != null) {
                Object obj2 = c31191br.A01.get(((Number) obj).intValue());
                return (obj2 == null && c31191br.A02.containsKey("gms_unknown")) ? "gms_unknown" : obj2;
            }
            throw null;
        }
        return obj;
    }

    public static void A01(StringBuilder sb, C31211bt c31211bt, Object obj) {
        int i = c31211bt.A03;
        if (i == 11) {
            sb.append(c31211bt.A06.cast(obj).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(C232415t.A00((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    public Object A02(C31211bt c31211bt) {
        String str = c31211bt.A07;
        if (c31211bt.A06 != null) {
            C07K.A1e(A04(str) == null, "Concrete field shouldn't be value object: %s", str);
            try {
                char upperCase = Character.toUpperCase(str.charAt(0));
                String substring = str.substring(1);
                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                sb.append("get");
                sb.append(upperCase);
                sb.append(substring);
                return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return A04(str);
    }

    public boolean A03(C31211bt c31211bt) {
        if (c31211bt.A04 == 11) {
            if (c31211bt.A0A) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return A06(c31211bt.A07);
    }

    public String toString() {
        Map A05 = A05();
        StringBuilder sb = new StringBuilder(100);
        for (String str : A05.keySet()) {
            C31211bt c31211bt = (C31211bt) A05.get(str);
            if (A03(c31211bt)) {
                Object A00 = A00(c31211bt, A02(c31211bt));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                C000200d.A1T(sb, "\"", str, "\":");
                if (A00 == null) {
                    sb.append("null");
                } else {
                    switch (c31211bt.A04) {
                        case 8:
                            sb.append("\"");
                            byte[] bArr = (byte[]) A00;
                            sb.append(bArr == null ? null : Base64.encodeToString(bArr, 0));
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            byte[] bArr2 = (byte[]) A00;
                            sb.append(bArr2 == null ? null : Base64.encodeToString(bArr2, 10));
                            sb.append("\"");
                            continue;
                        case 10:
                            AnonymousClass088.A1l(sb, (HashMap) A00);
                            continue;
                        default:
                            if (c31211bt.A09) {
                                AbstractList abstractList = (AbstractList) A00;
                                sb.append("[");
                                int size = abstractList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = abstractList.get(i);
                                    if (obj != null) {
                                        A01(sb, c31211bt, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                A01(sb, c31211bt, A00);
                                continue;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
