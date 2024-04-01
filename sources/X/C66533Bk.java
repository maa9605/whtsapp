package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Bk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66533Bk extends C0TS {
    public View A00;
    public TextView A01;
    public final /* synthetic */ C66543Bl A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66533Bk(C66543Bl c66543Bl, ViewGroup viewGroup) {
        super(c66543Bl.A01.inflate(R.layout.gif_picker_category, viewGroup, false));
        this.A02 = c66543Bl;
        View view = this.A0H;
        this.A00 = view.findViewById(R.id.gif_cat_marker);
        this.A01 = (TextView) view.findViewById(R.id.gif_category_title);
    }
}
