package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.49U  reason: invalid class name */
/* loaded from: classes3.dex */
public class C49U extends ArrayAdapter {
    public List A00;
    public final LayoutInflater A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49U(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, Context context, List list) {
        super(context, (int) R.layout.group_chat_info_row, list);
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = LayoutInflater.from(context);
        this.A00 = new ArrayList(list);
    }

    public /* synthetic */ void A00(C06C c06c, C49T c49t, View view) {
        QuickContactActivity.A00(this.A02, view, (AbstractC005302j) c06c.A03(AbstractC005302j.class), C0AT.A0G(c49t.A00));
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C49T c49t;
        C04460Kg c04460Kg;
        if (view == null) {
            view = this.A01.inflate(R.layout.group_chat_info_row, viewGroup, false);
            c49t = new C49T(null);
            PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A02;
            c49t.A03 = new C06030Rg(view, (int) R.id.name, paymentGroupParticipantPickerActivity.A06, paymentGroupParticipantPickerActivity.A0I);
            c49t.A00 = (ImageView) view.findViewById(R.id.avatar);
            c49t.A02 = (TextEmojiLabel) view.findViewById(R.id.group_participant_picker_push_name);
            c49t.A01 = (TextView) view.findViewById(R.id.status);
            view.setTag(c49t);
        } else {
            c49t = (C49T) view.getTag();
        }
        c49t.A03.A01.setText((CharSequence) null);
        c49t.A03.A01.setTextColor(C02160Ac.A00(getContext(), R.color.list_item_title));
        c49t.A03.A01.setAlpha(1.0f);
        c49t.A02.setVisibility(8);
        c49t.A01.setVisibility(8);
        c49t.A01.setText(R.string.participant_cant_receive_payments);
        C06C c06c = (C06C) this.A00.get(i);
        if (c06c != null) {
            c49t.A04 = c06c;
            c49t.A03.A03(c06c, null);
            ImageView imageView = c49t.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getApplicationContext().getResources().getString(R.string.transition_avatar));
            sb.append(C003101m.A07(c06c.A02()));
            C0AT.A0e(imageView, sb.toString());
            PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity2 = this.A02;
            paymentGroupParticipantPickerActivity2.A07.A02(c06c, c49t.A00);
            c49t.A00.setOnClickListener(new View$OnClickListenerC69853Qa(this, c06c, c49t));
            if (!paymentGroupParticipantPickerActivity2.A0C.A06((UserJid) c06c.A03(UserJid.class))) {
                c49t.A03.A01.setAlpha(0.5f);
                c49t.A01.setVisibility(0);
                C04460Kg c04460Kg2 = c06c.A08;
                if (c04460Kg2 != null && !TextUtils.isEmpty(c04460Kg2.A01)) {
                    c49t.A01.setText(R.string.contact_cant_receive_payments);
                }
            } else if (paymentGroupParticipantPickerActivity2.A03.A0H((UserJid) c06c.A03(UserJid.class))) {
                c49t.A03.A01.setAlpha(0.5f);
                c49t.A01.setVisibility(0);
                c49t.A01.setText(R.string.unblock_to_send_payments);
            }
            if (c06c.A0O == null || ((c04460Kg = c06c.A08) != null && !TextUtils.isEmpty(c04460Kg.A01))) {
                return view;
            }
            c49t.A02.setVisibility(0);
            TextEmojiLabel textEmojiLabel = c49t.A02;
            StringBuilder A0P = C000200d.A0P("~");
            A0P.append(c06c.A0O);
            textEmojiLabel.A03(A0P.toString());
            return view;
        }
        throw null;
    }
}
