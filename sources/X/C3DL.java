package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3DL  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DL extends AbstractC04890Mh {
    public int A00;
    public List A01;
    public final /* synthetic */ C2JZ A02;

    public C3DL(C2JZ c2jz) {
        this.A02 = c2jz;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        int size;
        List list = this.A01;
        int size2 = list == null ? 0 : list.size();
        List list2 = this.A01;
        if (list2 == null) {
            size = this.A00;
        } else {
            size = this.A00 - list2.size();
        }
        return (size <= 0 || size2 <= 0) ? size2 : size2 + 1;
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        int size;
        List list = this.A01;
        if (list == null) {
            size = this.A00;
        } else {
            size = this.A00 - list.size();
        }
        return (size <= 0 || i != this.A01.size()) ? 0 : 1;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.A02.A01;
        if (i != 0) {
            return new C3DM(layoutInflater.inflate(R.layout.accept_invite_participant_count, viewGroup, false));
        }
        return new C3DK(layoutInflater.inflate(R.layout.accept_invite_participant, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        int size;
        int A0D = A0D(i);
        if (A0D != 0) {
            if (A0D == 1) {
                TextView textView = ((C3DM) c0ts).A00;
                Context context = this.A02.A00;
                Object[] objArr = new Object[1];
                List list = this.A01;
                if (list == null) {
                    size = this.A00;
                } else {
                    size = this.A00 - list.size();
                }
                objArr[0] = Integer.valueOf(size);
                textView.setText(context.getString(R.string.additional_participant_count, objArr));
                return;
            }
            return;
        }
        C3DK c3dk = (C3DK) c0ts;
        C06C c06c = (C06C) this.A01.get(i);
        C2JZ c2jz = this.A02;
        TextView textView2 = c3dk.A01;
        if (c2jz != null) {
            if (!TextUtils.isEmpty(c06c.A0F)) {
                textView2.setText(c06c.A0F);
                textView2.setSingleLine(false);
                textView2.setTextColor(C02160Ac.A00(c2jz.A00, R.color.primary_text));
            } else if (c06c.A0E()) {
                textView2.setText(C018708s.A02(c06c, false));
                textView2.setSingleLine(false);
                textView2.setTextColor(C02160Ac.A00(c2jz.A00, R.color.primary_text));
            } else {
                String A0A = c2jz.A0L.A0A((AbstractC005302j) c06c.A03(AbstractC005302j.class));
                if (!TextUtils.isEmpty(A0A)) {
                    textView2.setSingleLine(false);
                    textView2.setTextColor(C02160Ac.A00(c2jz.A00, R.color.primary_text));
                } else if (!TextUtils.isEmpty(c06c.A0O)) {
                    StringBuilder A0P = C000200d.A0P("~");
                    A0P.append(c06c.A0O);
                    A0A = A0P.toString();
                    textView2.setSingleLine(false);
                    textView2.setTextColor(C02160Ac.A00(c2jz.A00, R.color.secondary_text));
                } else {
                    A0A = c2jz.A0K.A0F(C04630Le.A00(c06c));
                    textView2.setSingleLine(true);
                    textView2.setTextColor(C02160Ac.A00(c2jz.A00, R.color.primary_text));
                }
                textView2.setText(A0A);
            }
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            C0Zn c0Zn = c2jz.A0E;
            c0Zn.A04(c06c, c3dk.A00, false, new C52352aa(c0Zn.A04.A02, c06c));
            return;
        }
        throw null;
    }
}
