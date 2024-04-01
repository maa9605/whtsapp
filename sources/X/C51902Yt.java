package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.2Yt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51902Yt extends AbstractC51882Yr {
    public boolean A00;
    public final WaTextView A01;
    public final MessageThumbView A02;

    @Override // X.AbstractC51882Yr
    public float getRatio() {
        return 1.0f;
    }

    public C51902Yt(Context context) {
        super(context);
        A00();
        this.A01 = (WaTextView) C0AT.A0D(this, R.id.media_time);
        MessageThumbView messageThumbView = (MessageThumbView) C0AT.A0D(this, R.id.thumb_view);
        this.A02 = messageThumbView;
        messageThumbView.setContentDescription(context.getString(R.string.gif_preview_description));
    }

    @Override // X.AbstractC51882Yr
    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    @Override // X.AbstractC51882Yr, X.AbstractC51892Ys
    public void setMessage(C0LO c0lo) {
        super.setMessage((AnonymousClass097) c0lo);
        MessageThumbView messageThumbView = this.A02;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = ((AbstractC51892Ys) this).A00;
        messageThumbView.setMessage(c0lo);
        WaTextView waTextView = this.A01;
        waTextView.setText("");
        waTextView.setVisibility(8);
    }
}
