package X;

import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3CT  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3CT extends AbstractC04890Mh {
    public ArrayList A00;
    public List A01 = new ArrayList();
    public final /* synthetic */ GroupAdminPickerActivity A02;

    public C3CT(GroupAdminPickerActivity groupAdminPickerActivity) {
        this.A02 = groupAdminPickerActivity;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A01.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        return new C3CU(groupAdminPickerActivity, groupAdminPickerActivity.getLayoutInflater().inflate(R.layout.group_chat_info_row, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C3CU c3cu = (C3CU) c0ts;
        C06C c06c = (C06C) this.A01.get(i);
        c3cu.A01.setVisibility(8);
        c3cu.A04.A03(c06c, this.A00);
        this.A02.A0C.A02(c06c, c3cu.A00);
        if (c06c.A0A() && c06c.A0O != null) {
            TextEmojiLabel textEmojiLabel = c3cu.A02;
            textEmojiLabel.setVisibility(0);
            StringBuilder A0P = C000200d.A0P("~");
            A0P.append(c06c.A0O);
            textEmojiLabel.A06(A0P.toString(), this.A00, false, 0);
        } else {
            c3cu.A02.setVisibility(8);
        }
        if (c06c.A0L != null) {
            TextEmojiLabel textEmojiLabel2 = c3cu.A03;
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.A03(c06c.A0L);
        } else {
            c3cu.A03.setVisibility(8);
        }
        c3cu.A0H.setTag(c06c.A03(UserJid.class));
    }
}
