package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0qJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16380qJ {
    public Map A00 = new HashMap();

    public void A00(Map values) {
        for (Map.Entry entry : values.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                this.A00.put(key, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    if (cls == boolean[].class) {
                        Map map = this.A00;
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        Boolean[] boolArr = new Boolean[length];
                        for (int i = 0; i < length; i++) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                        }
                        map.put(key, boolArr);
                    } else if (cls == byte[].class) {
                        Map map2 = this.A00;
                        byte[] bArr = (byte[]) value;
                        int length2 = bArr.length;
                        Byte[] bArr2 = new Byte[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            bArr2[i2] = Byte.valueOf(bArr[i2]);
                        }
                        map2.put(key, bArr2);
                    } else if (cls == int[].class) {
                        Map map3 = this.A00;
                        int[] iArr = (int[]) value;
                        int length3 = iArr.length;
                        Integer[] numArr = new Integer[length3];
                        for (int i3 = 0; i3 < length3; i3++) {
                            numArr[i3] = Integer.valueOf(iArr[i3]);
                        }
                        map3.put(key, numArr);
                    } else if (cls == long[].class) {
                        Map map4 = this.A00;
                        long[] jArr = (long[]) value;
                        int length4 = jArr.length;
                        Long[] lArr = new Long[length4];
                        for (int i4 = 0; i4 < length4; i4++) {
                            lArr[i4] = Long.valueOf(jArr[i4]);
                        }
                        map4.put(key, lArr);
                    } else if (cls == float[].class) {
                        Map map5 = this.A00;
                        float[] fArr = (float[]) value;
                        int length5 = fArr.length;
                        Float[] fArr2 = new Float[length5];
                        for (int i5 = 0; i5 < length5; i5++) {
                            fArr2[i5] = Float.valueOf(fArr[i5]);
                        }
                        map5.put(key, fArr2);
                    } else if (cls == double[].class) {
                        Map map6 = this.A00;
                        double[] dArr = (double[]) value;
                        int length6 = dArr.length;
                        Double[] dArr2 = new Double[length6];
                        for (int i6 = 0; i6 < length6; i6++) {
                            dArr2[i6] = Double.valueOf(dArr[i6]);
                        }
                        map6.put(key, dArr2);
                    } else {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                    }
                } else {
                    this.A00.put(key, value);
                }
            }
        }
    }
}
