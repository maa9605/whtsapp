package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2x6 */
/* loaded from: classes2.dex */
public class C61962x6 extends AbstractC69093Nc {
    public C3TZ A00;
    public final C0L7 A01;
    public final C0Zn A02;
    public final C0DK A03;
    public final C41461tx A04;
    public final C41471ty A05;

    public C61962x6(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C41471ty c41471ty, C0L7 c0l7, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C0Zn c0Zn, C41461tx c41461tx, C02O c02o, C0DK c0dk, C52682b9 c52682b9) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
        this.A05 = c41471ty;
        this.A01 = c0l7;
        this.A02 = c0Zn;
        this.A04 = c41461tx;
        this.A03 = c0dk;
        A01();
    }

    @Override // X.C41Q, X.AbstractC86853yY
    public CharSequence A02(AnonymousClass092 anonymousClass092, C06C c06c) {
        C0KD c0kd = (C0KD) anonymousClass092;
        String str = (!(c0kd instanceof C0KC) || (str = ((C0KC) c0kd).A03) == null) ? "" : "";
        int i = R.drawable.ic_inline_live_location;
        if (c0kd instanceof C0LP) {
            i = R.drawable.msg_status_location;
        }
        Drawable A0O = C02180Ae.A0O(getContext(), i, R.color.msgStatusTint);
        TextPaint paint = ((AbstractC86853yY) this).A01.getPaint();
        if (!TextUtils.isEmpty(str)) {
            return C23X.A09(C50262Ra.A01("", A0O, paint), c06c, c0kd.A0n.A02, this.A08, this.A0A, this.A0F);
        }
        return super.A02(c0kd, c06c);
    }

    @Override // X.AbstractC86853yY
    /* renamed from: A08 */
    public void A05(C0KD c0kd, List list) {
        String string;
        long A06;
        String A0D;
        super.A05(c0kd, list);
        C3TZ c3tz = this.A00;
        if (c3tz != null) {
            String str = "";
            if (c0kd instanceof C0LP) {
                C0LP c0lp = (C0LP) c0kd;
                string = c0lp.A01;
                if (string == null) {
                    string = "";
                }
                A0D = c0lp.A00;
                String A1C = c0lp.A1C();
                if (A1C != null) {
                    Uri parse = Uri.parse(A1C);
                    if (parse.getHost() != null) {
                        str = parse.getHost();
                    }
                }
                if (TextUtils.isEmpty(string) && TextUtils.isEmpty(A0D)) {
                    string = c3tz.getContext().getString(R.string.pinned_location);
                }
            } else {
                C0KC c0kc = (C0KC) c0kd;
                string = c3tz.getContext().getString(R.string.live_location);
                C41461tx c41461tx = c3tz.A08;
                if (c0kc.A0n.A02) {
                    A06 = c41461tx.A07(c0kc);
                } else {
                    A06 = c41461tx.A06(c0kc);
                }
                AnonymousClass012 anonymousClass012 = c3tz.A05;
                A0D = C23X.A0D(c3tz.getContext(), c0kc, C23X.A0R(c0kc, A06, anonymousClass012), anonymousClass012, c3tz.A06, c41461tx);
            }
            c3tz.A00.setTitleAndDescription(string, A0D, list);
            if (str != null) {
                c3tz.A00.setSubText(str, null);
            }
            c3tz.A01.setMessage(c0kd);
            return;
        }
        throw null;
    }
}
