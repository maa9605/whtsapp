package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.03U */
/* loaded from: classes.dex */
public class C03U extends C03V implements InterfaceC004201y {
    public static volatile InterfaceC004201y A03;
    public final C006903a A00;
    public final InterfaceC002901k A01;
    public final C00J A02;

    public C03U(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C006903a c006903a, C03X c03x, C00J c00j, C007303e c007303e, InterfaceC007503g interfaceC007503g, C007603h c007603h) {
        super(anonymousClass012, c03x, c007303e, interfaceC007503g, c007603h);
        this.A01 = interfaceC002901k;
        this.A02 = c00j;
        this.A00 = c006903a;
    }

    public static InterfaceC004201y A00() {
        if (A03 == null) {
            synchronized (InterfaceC004201y.class) {
                if (A03 == null) {
                    A03 = new C03U(AnonymousClass012.A00(), C002801j.A00(), new C006903a(C03W.A00(), C03Y.A00()), C03W.A00(), C007203d.A00(new InterfaceC007103c() { // from class: X.03b
                        @Override // X.InterfaceC007103c
                        public final Object get() {
                            if (C1QB.A08 == null) {
                                synchronized (C1QB.class) {
                                    if (C1QB.A08 == null) {
                                        AnonymousClass012 A002 = AnonymousClass012.A00();
                                        InterfaceC002901k A003 = C002801j.A00();
                                        C03Z.A00();
                                        C1QB.A08 = new C1QB(A002, A003, C007303e.A00(), C03W.A00(), C007603h.A00(), C0XZ.A00(), C03U.A00(), C03Y.A00());
                                    }
                                }
                            }
                            return C1QB.A08;
                        }
                    }), C007303e.A00(), C007403f.A00(), C007603h.A00());
                }
            }
        }
        return A03;
    }

    @Override // X.InterfaceC004201y
    public void A7d(short s, int i) {
        if (super.A01.A04()) {
            long A00 = A00();
            A04(this.A05, s, i, A00);
            A04(this.A07, s, i, A00);
        }
    }

    @Override // X.InterfaceC004201y
    public void A7e(short s, boolean z) {
        if (super.A01.A04()) {
            long A00 = A00();
            A05(this.A07, s, z, A00);
            A05(this.A05, s, z, A00);
        }
    }

    @Override // X.InterfaceC004201y
    public Collection A8L() {
        HashSet hashSet = new HashSet(this.A05.keySet());
        for (Number number : this.A07.keySet()) {
            hashSet.add(Integer.valueOf((int) (number.longValue() >> 32)));
        }
        return hashSet;
    }

    @Override // X.InterfaceC004201y
    public void AGE(int i, int i2, String str, int i3) {
        C37971nL A01 = A01(i, Integer.valueOf(i2));
        if (A01 != null) {
            A01.A00(str, Long.valueOf(i3), 1);
        }
    }

    @Override // X.InterfaceC004201y
    public void AGF(int i, int i2, String str, String str2) {
        C37971nL A01 = A01(i, Integer.valueOf(i2));
        if (A01 != null) {
            A01.A00(str, str2, str2.length());
        }
    }

    @Override // X.InterfaceC004201y
    public void AGG(int i, String str, String str2) {
        C37971nL A01 = A01(i, null);
        if (A01 != null) {
            A01.A00(str, str2, str2.length());
        }
    }

    @Override // X.InterfaceC004201y
    public void AGH(int i, int i2, short s) {
        C37971nL A032 = A03(i, Integer.valueOf(i2), s, super.A00());
        if (A032 != null) {
            this.A06.add(A032);
            AWJ();
        }
    }

    @Override // X.InterfaceC004201y
    public void AGI(int i, short s) {
        C37971nL A032 = A03(i, null, s, super.A00());
        if (A032 != null) {
            this.A06.add(A032);
            AWJ();
        }
    }

    @Override // X.InterfaceC004201y
    public void AGJ(int i, String str) {
        C37971nL A01 = A01(i, null);
        if (A01 != null) {
            long A00 = super.A00();
            AtomicInteger atomicInteger = A01.A0D;
            if (atomicInteger.get() >= 1000) {
                A01.A04.A01(2, "markerId:%d", Integer.valueOf(A01.A00));
            } else if (str.length() > 50) {
                A01.A04.A01(12, "markerId:%d, pointName:%s", Integer.valueOf(A01.A00), str);
            } else {
                A01.A0A.put(Integer.valueOf(atomicInteger.getAndIncrement()), new C1QE(str, A00));
            }
        }
    }

    @Override // X.InterfaceC004201y
    public void AGK(int i) {
        A02(i, null, A00());
    }

    @Override // X.InterfaceC004201y
    public void AGL(int i, int i2) {
        A02(i, Integer.valueOf(i2), A00());
    }

    @Override // X.InterfaceC004201y
    public String AQm() {
        Object string;
        Class<?> cls;
        boolean z;
        String str;
        C006903a c006903a = this.A00;
        C37971nL c37971nL = (C37971nL) this.A06.poll();
        if (c37971nL != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                int i = c37971nL.A00;
                jSONObject.put("marker_id", i);
                Object obj = c37971nL.A07;
                if (obj != null) {
                    jSONObject.put("instance_id", obj);
                }
                jSONObject.put("action_id", (short) c37971nL.A0C.get());
                jSONObject.put("method", c37971nL.A0G ? "per_user" : "random_sampling");
                jSONObject.put("sample_rate", c37971nL.A02);
                long j = c37971nL.A0E.get();
                long j2 = c37971nL.A03;
                jSONObject.put("duration_ns", j - j2);
                C003701t c003701t = c006903a.A00.A02;
                synchronized (c003701t) {
                    string = c003701t.A0N.getString("ab_props:sys:config_key", null);
                }
                jSONObject.put("wa_ab_key2", string);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c37971nL.A0A.values()) {
                    if (obj2 != null) {
                        arrayList.add(obj2);
                    }
                }
                Collections.sort(arrayList);
                if (!arrayList.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1QE c1qe = (C1QE) it.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", c1qe.A01);
                        jSONObject2.put("time_since_start_ns", c1qe.A00 - j2);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("points", jSONArray);
                }
                HashMap hashMap = new HashMap();
                ConcurrentHashMap concurrentHashMap = c37971nL.A08;
                for (Object obj3 : concurrentHashMap.keySet()) {
                    Object obj4 = concurrentHashMap.get(obj3);
                    if (obj4 != null) {
                        hashMap.put(obj3, obj4);
                    }
                }
                if (!hashMap.isEmpty()) {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        Class<?> cls2 = entry.getValue().getClass();
                        List list = (List) hashMap2.get(cls2);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap2.put(cls2, list);
                        }
                        list.add(entry);
                    }
                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                        Object key = entry2.getKey();
                        if (key == String.class) {
                            str = "annotations";
                        } else if (key == Double.class) {
                            str = "annotations_double";
                        } else if (key == Boolean.class) {
                            str = "annotations_bool";
                        } else if (key == Long.class) {
                            str = "annotations_int";
                        } else if (key == String[].class) {
                            str = "annotations_string_array";
                        } else if (key == double[].class) {
                            str = "annotations_double_array";
                        } else if (key == boolean[].class) {
                            str = "annotations_bool_array";
                        } else if (key != long[].class) {
                            StringBuilder sb = new StringBuilder("Unknown class: ");
                            sb.append(key);
                            throw new IllegalArgumentException(sb.toString());
                        } else {
                            str = "annotations_int_array";
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        if (((Class) entry2.getKey()).isArray()) {
                            for (Map.Entry entry3 : (List) entry2.getValue()) {
                                jSONObject3.put((String) entry3.getKey(), C006903a.A00((Class) entry2.getKey(), entry3.getValue()));
                            }
                        } else {
                            for (Map.Entry entry4 : (List) entry2.getValue()) {
                                C006903a.A01(jSONObject3, (String) entry4.getKey(), entry4.getValue(), (Class) entry2.getKey());
                            }
                        }
                        jSONObject.put(str, jSONObject3);
                    }
                }
                HashMap hashMap3 = new HashMap();
                ConcurrentHashMap concurrentHashMap2 = c37971nL.A09;
                for (Pair pair : concurrentHashMap2.keySet()) {
                    Object obj5 = concurrentHashMap2.get(pair);
                    if (obj5 != null) {
                        Object obj6 = pair.first;
                        Object obj7 = pair.second;
                        Map map = (Map) hashMap3.get(obj6);
                        if (map == null) {
                            map = new HashMap();
                            hashMap3.put(obj6, map);
                        }
                        map.put(obj7, obj5);
                    }
                }
                if (!hashMap3.isEmpty()) {
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry entry5 : hashMap3.entrySet()) {
                        if (entry5.getValue() != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            for (Map.Entry entry6 : ((Map) entry5.getValue()).entrySet()) {
                                if (entry6.getValue() != null && ((cls = entry6.getValue().getClass()) != Double.class || AnonymousClass029.A1V(c006903a.A01, i, (String) entry6.getKey(), ((Number) entry6.getValue()).doubleValue()))) {
                                    if (cls == double[].class) {
                                        C03X c03x = c006903a.A01;
                                        String str2 = (String) entry6.getKey();
                                        double[] dArr = (double[]) entry6.getValue();
                                        int length = dArr.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                z = true;
                                                break;
                                            } else if (!AnonymousClass029.A1V(c03x, i, str2, dArr[i2])) {
                                                z = false;
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        if (!z) {
                                        }
                                    }
                                    if (cls.isArray()) {
                                        jSONObject5.put((String) entry6.getKey(), C006903a.A00(cls, entry6.getValue()));
                                    } else {
                                        C006903a.A01(jSONObject5, (String) entry6.getKey(), entry6.getValue(), cls);
                                    }
                                }
                            }
                            jSONObject4.put((String) entry5.getKey(), jSONObject5);
                        }
                    }
                    jSONObject.put("metadata", jSONObject4);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                c006903a.A01.A00(c37971nL.A00, e.getMessage());
            }
        }
        return null;
    }

    @Override // X.InterfaceC004201y
    public void AWJ() {
        this.A01.AS3((Runnable) this.A02.get(), "qpl_fs_writer");
    }
}
