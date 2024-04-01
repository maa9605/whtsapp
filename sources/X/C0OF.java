package X;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0OF  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OF {
    public static final C0OF A01;
    public static final String A02 = AbstractC16430qO.A01("Data");
    public Map A00;

    static {
        C0OF c0of = new C0OF(new HashMap());
        A01(c0of);
        A01 = c0of;
    }

    public C0OF() {
    }

    public C0OF(C0OF other) {
        this.A00 = new HashMap(other.A00);
    }

    public C0OF(Map values) {
        this.A00 = new HashMap(values);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0060: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:50:0x006c, block:B:33:0x0060 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0OF A00(byte[] r7) {
        /*
            java.lang.String r3 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L77
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r7)
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c java.io.IOException -> L3e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c java.io.IOException -> L3e
            int r2 = r4.readInt()     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L5f
        L1b:
            if (r2 <= 0) goto L2b
            java.lang.String r1 = r4.readUTF()     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L5f
            java.lang.Object r0 = r4.readObject()     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L5f
            r6.put(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L36 java.io.IOException -> L38 java.lang.Throwable -> L5f
            int r2 = r2 + (-1)
            goto L1b
        L2b:
            r4.close()     // Catch: java.io.IOException -> L2f
            goto L4f
        L2f:
            r1 = move-exception
            java.lang.String r0 = X.C0OF.A02
            android.util.Log.e(r0, r3, r1)
            goto L4f
        L36:
            r0 = move-exception
            goto L40
        L38:
            r0 = move-exception
            goto L40
        L3a:
            r2 = move-exception
            goto L6c
        L3c:
            r0 = move-exception
            goto L3f
        L3e:
            r0 = move-exception
        L3f:
            r4 = r1
        L40:
            java.lang.String r1 = X.C0OF.A02     // Catch: java.lang.Throwable -> L5f
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L4f
            r4.close()     // Catch: java.io.IOException -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L4f:
            r5.close()     // Catch: java.io.IOException -> L53
            goto L59
        L53:
            r1 = move-exception
            java.lang.String r0 = X.C0OF.A02
            android.util.Log.e(r0, r3, r1)
        L59:
            X.0OF r0 = new X.0OF
            r0.<init>(r6)
            return r0
        L5f:
            r2 = move-exception
            if (r4 == 0) goto L6c
            r4.close()     // Catch: java.io.IOException -> L66
            goto L6c
        L66:
            r1 = move-exception
            java.lang.String r0 = X.C0OF.A02
            android.util.Log.e(r0, r3, r1)
        L6c:
            r5.close()     // Catch: java.io.IOException -> L70
            throw r2
        L70:
            r1 = move-exception
            java.lang.String r0 = X.C0OF.A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        L77:
            java.lang.String r1 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OF.A00(byte[]):X.0OF");
    }

    public static byte[] A01(C0OF data) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.A00.size());
                    for (Map.Entry entry : data.A00.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        Log.e(A02, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(A02, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    String str = A02;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.e(str, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (IOException e5) {
                        Log.e(str, "Error in Data#toByteArray: ", e5);
                        return byteArray;
                    }
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(A02, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(A02, "Error in Data#toByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }

    public int A02(String str) {
        Object obj = this.A00.get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C0OF.class != o.getClass()) {
            return false;
        }
        C0OF c0of = (C0OF) o;
        Set keySet = this.A00.keySet();
        if (keySet.equals(c0of.A00.keySet())) {
            for (Object obj : keySet) {
                Object obj2 = this.A00.get(obj);
                Object obj3 = c0of.A00.get(obj);
                if (obj2 != null) {
                    if (obj3 != null) {
                        if (!(((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                    return false;
                } else if (obj2 != obj3) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.A00.isEmpty()) {
            for (String str : this.A00.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.A00.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
