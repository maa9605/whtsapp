package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2iq */
/* loaded from: classes2.dex */
public class C54492iq extends AbstractC04890Mh {
    public C39V A01;
    public final List A02 = new ArrayList();
    public int A00 = -1;

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A02.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return (!TextUtils.isEmpty(((C59432sk) this.A02.get(i)).A01) ? 1 : 0) ^ 1;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new C68393Jm(from.inflate(R.layout.select_list_bottom_sheet_section_item, viewGroup, false));
        }
        return new C54472io(this, from.inflate(R.layout.select_list_bottom_sheet_item, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        AbstractC54482ip abstractC54482ip = (AbstractC54482ip) c0ts;
        if (A0D(i) == 0) {
            C68393Jm c68393Jm = (C68393Jm) abstractC54482ip;
            String str = ((C59432sk) this.A02.get(i)).A01;
            if (c68393Jm != null) {
                if (TextUtils.isEmpty(str)) {
                    c68393Jm.A0H.setVisibility(8);
                    return;
                }
                c68393Jm.A0H.setVisibility(0);
                c68393Jm.A00.A06(str, null, false, 0);
                return;
            }
            throw null;
        }
        C0XV c0xv = ((C59432sk) this.A02.get(i)).A00;
        C54472io c54472io = (C54472io) abstractC54482ip;
        if (c0xv == null) {
            c54472io.A0H.setVisibility(8);
            return;
        }
        c54472io.A00.setChecked(c54472io.A00() == c54472io.A03.A00);
        c54472io.A0H.setVisibility(0);
        c54472io.A02.A03(c0xv.A02);
        String str2 = c0xv.A00;
        if (TextUtils.isEmpty(str2)) {
            c54472io.A01.setVisibility(8);
            return;
        }
        TextEmojiLabel textEmojiLabel = c54472io.A01;
        textEmojiLabel.A03(str2);
        textEmojiLabel.setVisibility(0);
    }
}
