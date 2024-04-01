package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.3Ie  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68133Ie extends C0TS {
    public final int A00;
    public final View A01;
    public final FrameLayout A02;
    public final TextEmojiLabel A03;
    public final C06030Rg A04;
    public final ThumbnailButton A05;

    public C68133Ie(C68143If c68143If, FrameLayout frameLayout) {
        super(frameLayout);
        int i = Build.VERSION.SDK_INT;
        this.A00 = (i < 19 || (i < 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) ? 1711315455 : 419430400;
        this.A02 = frameLayout;
        ThumbnailButton thumbnailButton = (ThumbnailButton) frameLayout.findViewById(R.id.contact_photo);
        this.A05 = thumbnailButton;
        thumbnailButton.setEnabled(false);
        C06030Rg c06030Rg = new C06030Rg(frameLayout, (int) R.id.contact_name, c68143If.A0C, c68143If.A0H);
        this.A04 = c06030Rg;
        c06030Rg.A01.setTextColor(c68143If.A00);
        this.A03 = (TextEmojiLabel) frameLayout.findViewById(R.id.push_name);
        FrameLayout frameLayout2 = this.A02;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(this.A00));
        frameLayout2.setForeground(stateListDrawable);
        this.A01 = frameLayout.findViewById(R.id.separator);
        this.A03.setTextColor(c68143If.A02);
    }
}
