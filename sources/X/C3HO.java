package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;

/* renamed from: X.3HO  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3HO extends C0TS {
    public C2K1 A00;
    public ShapeItemView A01;
    public final /* synthetic */ C2IQ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3HO(C2IQ c2iq, View view) {
        super(view);
        this.A02 = c2iq;
        ShapeItemView shapeItemView = (ShapeItemView) view.findViewById(R.id.shape_item_view);
        this.A01 = shapeItemView;
        if (c2iq.A07.A0o) {
            ViewGroup.LayoutParams layoutParams = shapeItemView.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            this.A01.setLayoutParams(layoutParams);
        }
        view.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(this));
    }
}
