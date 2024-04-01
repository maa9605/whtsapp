package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.group.NewGroup;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2K9 */
/* loaded from: classes2.dex */
public class C2K9 extends AbstractC05910Qs implements C0I3, C0T9, C0TA {
    public C05160No A00;
    public String A01;
    public List A02;
    public final AnonymousClass012 A03;
    public final C03340Fh A04;
    public final C0C9 A05;
    public final C0ES A06;
    public final C04500Kk A07;
    public final C07A A08;
    public final C41991uq A09;

    public C2K9(AnonymousClass012 anonymousClass012, C41991uq c41991uq, C0C9 c0c9, C0ES c0es, C07A c07a, C03340Fh c03340Fh, C05160No c05160No, String str, List list, C04500Kk c04500Kk) {
        this.A03 = anonymousClass012;
        this.A09 = c41991uq;
        this.A05 = c0c9;
        this.A06 = c0es;
        this.A08 = c07a;
        this.A04 = c03340Fh;
        this.A00 = c05160No;
        this.A01 = str;
        this.A02 = list;
        this.A07 = c04500Kk;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }

    @Override // X.AbstractC05910Qs
    public void A00() {
        Log.i("groupmgr/group_request/timeout/type: 14");
        super.A01 = true;
        C0ES c0es = this.A06;
        c0es.A0l.remove(this.A00);
        this.A05.A0Q(this.A08.A04(this.A00, this.A03.A05(), 3, this.A01, this.A02));
        C04500Kk c04500Kk = this.A07;
        if (c04500Kk != null) {
            this.A09.A0E(c04500Kk.A01, 500);
        }
        this.A04.A07(this.A00, false);
    }

    public void A01(C011005l c011005l) {
        cancel();
        super.A00 = true;
        StringBuilder sb = new StringBuilder("groupmgr/request success : ");
        sb.append(c011005l);
        sb.append(" | ");
        sb.append(14);
        Log.i(sb.toString());
        C04500Kk c04500Kk = this.A07;
        if (c04500Kk != null) {
            this.A09.A0E(c04500Kk.A01, 200);
        }
        this.A04.A07(this.A00, false);
    }

    @Override // X.C0I3
    public void ARv(int i) {
        StringBuilder A0Q = C000200d.A0Q("groupmgr/request failed : ", i, " | ");
        A0Q.append(this.A00);
        A0Q.append(" | ");
        A0Q.append(14);
        Log.e(A0Q.toString());
        cancel();
        C0ES c0es = this.A06;
        c0es.A0l.remove(this.A00);
        if (i == 406) {
            C0ES.A02(2003, this.A01);
        } else if (i == 429) {
            C0ES.A02(2004, this.A01);
        } else if (i != 500) {
            C0ES.A02(2001, this.A01);
        } else {
            C0ES.A02(2002, this.A01);
        }
        this.A05.A0Q(this.A08.A04(this.A00, this.A03.A05(), 3, this.A01, this.A02));
        C04500Kk c04500Kk = this.A07;
        if (c04500Kk != null) {
            this.A09.A0E(c04500Kk.A01, i);
        }
        this.A04.A07(this.A00, false);
    }

    @Override // X.C0TA
    public void ARx(C2KE c2ke) {
        if (this instanceof C2K8) {
            NewGroup newGroup = ((C2K8) this).A00;
            if (newGroup.A08.A0E(C01C.A12)) {
                Map map = c2ke.A02;
                if (map.size() > 0) {
                    Set keySet = map.keySet();
                    Intent A00 = InviteGroupParticipantsActivity.A00(newGroup, c2ke);
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("jids", C003101m.A0E(keySet));
                    bundle.putParcelable("invite_intent", A00);
                    newGroup.A01 = bundle;
                }
            }
        }
    }
}
