package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.07u */
/* loaded from: classes.dex */
public final class C016807u extends AbstractC016907v implements AnonymousClass081 {
    public AnonymousClass085 A00;
    public final int A01;
    public final boolean A02;

    public C016807u(int i, boolean z) {
        this.A01 = i;
        this.A02 = z;
        this.A00 = new AnonymousClass085(z);
    }

    @Override // X.AbstractC016907v
    public AbstractC016907v A02() {
        C016807u c016807u = (C016807u) super.AGB();
        AnonymousClass085 anonymousClass085 = this.A00;
        AnonymousClass085 anonymousClass0852 = new AnonymousClass085(anonymousClass085.A01);
        anonymousClass0852.A00.putAll(anonymousClass085.A00);
        c016807u.A00 = anonymousClass0852;
        List A05 = c016807u.A05();
        AnonymousClass084 A02 = C09M.A00().A07.A02(this);
        if (A05 != Collections.EMPTY_LIST && A02 != null) {
            c016807u.A00.A02(A02, new ArrayList(A05));
        }
        return c016807u;
    }

    @Override // X.AbstractC016907v
    public boolean A03(C1EQ c1eq) {
        if (c1eq.AW0(this)) {
            return true;
        }
        List A05 = A05();
        for (int i = 0; i < A05.size(); i++) {
            AnonymousClass080 anonymousClass080 = (AnonymousClass080) A05.get(i);
            if ((anonymousClass080 instanceof AbstractC016907v) && ((AbstractC016907v) anonymousClass080).A03(c1eq)) {
                return true;
            }
        }
        return false;
    }

    public int A04(AnonymousClass084 anonymousClass084, int i) {
        Number number = (Number) this.A00.A00(anonymousClass084);
        return number != null ? number.intValue() : i;
    }

    public List A05() {
        List list;
        AnonymousClass084 A02 = C09M.A00().A07.A02(this);
        if (A02 == null) {
            return Collections.EMPTY_LIST;
        }
        Object A00 = this.A00.A00(A02);
        if (A00 == null) {
            list = Collections.emptyList();
        } else if (A00 instanceof AbstractC016907v) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(A00);
            return arrayList;
        } else {
            list = (List) A00;
        }
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // X.AnonymousClass082
    /* renamed from: A06 */
    public List AAv(AnonymousClass084 anonymousClass084) {
        Object A00 = this.A00.A00(anonymousClass084);
        return A00 == null ? Collections.emptyList() : (List) A00;
    }

    @Override // X.AnonymousClass082
    /* renamed from: A07 */
    public boolean A8Z(AnonymousClass084 anonymousClass084, boolean z) {
        Object A00 = this.A00.A00(anonymousClass084);
        if (A00 == null) {
            return z;
        }
        if (A00 instanceof Boolean) {
            return ((Boolean) A00).booleanValue();
        }
        return ((Number) A00).intValue() == 1;
    }

    @Override // X.AnonymousClass082
    public /* bridge */ /* synthetic */ List A8u(Object obj) {
        Object A00 = this.A00.A00((AnonymousClass084) obj);
        if (A00 == null) {
            return Collections.emptyList();
        }
        if (A00 instanceof AbstractC016907v) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(A00);
            return arrayList;
        }
        return (List) A00;
    }

    @Override // X.AnonymousClass081
    public C09P AA3(AnonymousClass084 anonymousClass084) {
        Object A00 = this.A00.A00(anonymousClass084);
        if (A00 == null) {
            return null;
        }
        if (A00 instanceof C09P) {
            return (C09P) A00;
        }
        try {
            return new C020709n((String) A00, null);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Value stored for key: ");
            sb.append(anonymousClass084);
            sb.append(" was accessed as an Expression but parsing failed with ");
            sb.append(e);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // X.AnonymousClass082
    public /* bridge */ /* synthetic */ float AAF(Object obj, float f) {
        Number number = (Number) this.A00.A00((AnonymousClass084) obj);
        if (number != null) {
            return number.floatValue();
        }
        return f;
    }

    @Override // X.AnonymousClass082
    public long AB0(Object obj, long j) {
        Number number = (Number) this.A00.A00((AnonymousClass084) obj);
        return number != null ? number.longValue() : j;
    }

    @Override // X.AnonymousClass082
    public /* bridge */ /* synthetic */ Object ABT(Object obj) {
        return this.A00.A00((AnonymousClass084) obj);
    }

    @Override // X.AnonymousClass082
    public /* bridge */ /* synthetic */ String ADJ(Object obj) {
        return (String) this.A00.A00((AnonymousClass084) obj);
    }

    @Override // X.AnonymousClass082
    public String ADK(Object obj, String str) {
        String str2 = (String) this.A00.A00((AnonymousClass084) obj);
        return str2 != null ? str2 : str;
    }

    @Override // X.AnonymousClass081
    public int ADL() {
        return this.A01;
    }

    @Override // X.AnonymousClass082
    public /* bridge */ /* synthetic */ Object ADg(Object obj) {
        return this.A00.A00((AnonymousClass084) obj);
    }

    @Override // X.AnonymousClass081
    public boolean AF7() {
        return this.A02;
    }

    @Override // X.AnonymousClass081
    public void AQy(String str, int i, Object obj) {
        AnonymousClass085 anonymousClass085 = this.A00;
        if (anonymousClass085.A01) {
            anonymousClass085.A00.put(Integer.valueOf(i), obj);
        } else {
            anonymousClass085.A00.put(str, obj);
        }
    }
}
