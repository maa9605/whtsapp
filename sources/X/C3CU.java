package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.3CU  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3CU extends C0TS {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final C06030Rg A04;

    public C3CU(GroupAdminPickerActivity groupAdminPickerActivity, View view) {
        super(view);
        this.A04 = new C06030Rg(view, (int) R.id.name, groupAdminPickerActivity.A0B, groupAdminPickerActivity.A0L);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.status);
        this.A00 = (ImageView) view.findViewById(R.id.avatar);
        this.A01 = (TextView) view.findViewById(R.id.owner);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        C0AT.A0V(this.A00, 2);
        C06030Rg c06030Rg = this.A04;
        c06030Rg.A01.setTextColor(C02160Ac.A00(view.getContext(), R.color.list_item_title));
        this.A03.setTextColor(C02160Ac.A00(view.getContext(), R.color.list_item_sub_title));
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setOnClickListener(groupAdminPickerActivity.A0P);
    }
}
