package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1vZ */
/* loaded from: classes2.dex */
public class C42331vZ implements InterfaceC42341va {
    public static volatile C42331vZ A06;
    public boolean A00;
    public final AbstractC000600i A01;
    public final C47682Ce A02;
    public final C47702Cg A03;
    public final C47692Cf A04;
    public final C47712Ch A05;

    public C42331vZ(AbstractC000600i abstractC000600i, C001200o c001200o, C47682Ce c47682Ce, C04Z c04z, C47692Cf c47692Cf, C47702Cg c47702Cg) {
        this.A01 = abstractC000600i;
        this.A02 = c47682Ce;
        this.A04 = c47692Cf;
        this.A03 = c47702Cg;
        this.A05 = new C47712Ch(c001200o.A00, abstractC000600i, c04z);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.2Cg] */
    public static C42331vZ A00() {
        if (A06 == null) {
            synchronized (C42331vZ.class) {
                if (A06 == null) {
                    A06 = new C42331vZ(AbstractC000600i.A00(), C001200o.A01, C47682Ce.A00(), C04Z.A00(), C47692Cf.A00(), new Comparator(EnumC47722Ci.values()) { // from class: X.2Cg
                        public HashMap A00;
                        public final InterfaceC47732Cj[] A01;

                        {
                            this.A01 = r1;
                        }

                        public final int A00(C2CI c2ci) {
                            if (A01().containsKey(c2ci)) {
                                return ((Number) A01().get(c2ci)).intValue();
                            }
                            StringBuilder A0P = C000200d.A0P("EmojiPickerComparator/found an emoji that doesn't exist in emoji picker ");
                            A0P.append(c2ci.toString());
                            Log.e(A0P.toString());
                            return 0;
                        }

                        public final synchronized HashMap A01() {
                            HashMap hashMap;
                            hashMap = this.A00;
                            if (hashMap == null) {
                                hashMap = new HashMap();
                                int i = 0;
                                for (InterfaceC47732Cj interfaceC47732Cj : this.A01) {
                                    for (int[] iArr : ((EnumC47722Ci) interfaceC47732Cj).emojiData) {
                                        hashMap.put(new C2CI(iArr), Integer.valueOf(i));
                                        i++;
                                    }
                                }
                                this.A00 = hashMap;
                            }
                            return hashMap;
                        }

                        @Override // java.util.Comparator
                        public int compare(Object obj, Object obj2) {
                            return A00((C2CI) obj) - A00((C2CI) obj2);
                        }
                    });
                }
            }
        }
        return A06;
    }

    public static final LinkedHashSet A01(List list, HashSet hashSet) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!hashSet.isEmpty()) {
            for (Object obj : list) {
                if (hashSet.contains(obj)) {
                    linkedHashSet.add(obj);
                    hashSet.remove(obj);
                }
            }
        }
        return linkedHashSet;
    }

    public List A02(String str, int i, List list, List list2, boolean z) {
        String trim = str.trim();
        String A0F = AnonymousClass024.A0F(trim);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            linkedHashSet.addAll(A03(i, A0F, list, list2, true));
        } else if (TextUtils.isEmpty(trim)) {
            linkedHashSet.addAll(list);
            linkedHashSet.addAll(list2);
        } else {
            linkedHashSet.addAll(A03(i - linkedHashSet.size(), A0F, list, list2, true));
            if (linkedHashSet.size() < i) {
                linkedHashSet.addAll(A03(i - linkedHashSet.size(), A0F, list, list2, false));
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C2CI c2ci = (C2CI) it.next();
            if (arrayList.size() >= i) {
                break;
            }
            int[] iArr = c2ci.A00;
            if (iArr.length == 1) {
                C2CI c2ci2 = new C2CI(new int[]{iArr[0], 65039});
                if (EmojiDescriptor.A00(new C43941yG(c2ci2.A00), true) != -1) {
                    arrayList.add(c2ci2);
                }
            }
            if (EmojiDescriptor.A01(iArr) != -1) {
                arrayList.add(c2ci);
            }
        }
        return arrayList;
    }

    public final Set A03(int i, String str, List list, List list2, boolean z) {
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (linkedHashSet.size() < i) {
            if (this.A00) {
                hashSet = new HashSet();
                StringBuilder A0P = C000200d.A0P("SELECT DISTINCT symbol FROM emoji_search_tag WHERE type=? AND (tag");
                C000200d.A1U(A0P, z ? " = " : " LIKE ", "? OR ", "symbol", "=?)");
                String A0L = C000200d.A0L(A0P, " ORDER BY _id ASC", " LIMIT ?");
                String[] strArr = new String[4];
                strArr[0] = "1";
                strArr[1] = z ? str : C000200d.A0H(str, "%");
                strArr[2] = str;
                strArr[3] = String.valueOf(256);
                try {
                    Cursor A07 = new C0CD(null, this.A05, false).A02.A07(A0L, strArr);
                    while (A07.moveToNext()) {
                        hashSet.add(C43981yK.A04(A07.getString(0)));
                    }
                    A07.close();
                } finally {
                }
            } else {
                throw new IllegalStateException("emoji dictionary is not prepared yet");
            }
        }
        if (linkedHashSet.size() < i) {
            linkedHashSet.addAll(A01(list, hashSet));
        }
        if (linkedHashSet.size() < i) {
            linkedHashSet.addAll(A01(list2, hashSet));
        }
        if (linkedHashSet.size() < i && hashSet.size() > 0) {
            ArrayList arrayList = new ArrayList(hashSet.size());
            arrayList.addAll(hashSet);
            Collections.sort(arrayList, this.A03);
            linkedHashSet.addAll(arrayList);
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC42341va
    public void A68() {
        C0CD c0cd = new C0CD(null, this.A05, true);
        try {
            C03790Hb A00 = c0cd.A00();
            c0cd.A02.A01("emoji_search_tag", "type=?", new String[]{String.valueOf(1)});
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.InterfaceC42341va
    public Collection A7l(String str, int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : this.A02.A02()) {
            arrayList.add(new C2CI(iArr));
        }
        C47692Cf c47692Cf = this.A04;
        List list = c47692Cf.A00;
        List list2 = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            String string = c47692Cf.A01.A00.getString("top_emojis", null);
            if (string != null) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList2.add(C43981yK.A04(jSONArray.getString(i2)));
                    }
                    c47692Cf.A00 = arrayList2;
                    list2 = arrayList2;
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder("topemojisstore/get-top-emojis/failed ");
                    sb.append(e);
                    Log.e(sb.toString());
                    list2 = C47692Cf.A02;
                }
            } else {
                list2 = C47692Cf.A02;
            }
        }
        return A02(str, i, arrayList, list2, z2);
    }

    @Override // X.InterfaceC42341va
    public void ATC(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC42341va
    public int getCount() {
        C0CD c0cd = new C0CD(null, this.A05, false);
        try {
            Cursor A07 = c0cd.A02.A07("SELECT count(*) FROM emoji_search_tag WHERE type=?", new String[]{String.valueOf(1)});
            int i = A07.moveToNext() ? A07.getInt(0) : 0;
            A07.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
