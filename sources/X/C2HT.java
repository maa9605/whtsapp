package X;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.2HT  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2HT {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public ImageView A09;
    public TextView A0A;
    public boolean A0B;
    public final /* synthetic */ MediaComposerActivity A0F;
    public final int[] A0E = new int[2];
    public final Handler A0C = new Handler(Looper.getMainLooper());
    public final Runnable A0D = new RunnableEBaseShape8S0100000_I1_0(this, 42);

    public C2HT(MediaComposerActivity mediaComposerActivity, final Activity activity) {
        this.A0F = mediaComposerActivity;
        this.A03 = C02160Ac.A03(activity, R.drawable.ic_remove_white);
        this.A02 = C02160Ac.A03(activity, R.drawable.ic_remove_red);
        this.A08 = (ViewGroup) activity.findViewById(R.id.remove_frame);
        this.A0A = (TextView) activity.findViewById(R.id.drag_remove);
        this.A05 = activity.findViewById(R.id.drag_remove_padding);
        this.A07 = (ViewGroup) activity.findViewById(R.id.drag_frame);
        AbstractC68683Kz abstractC68683Kz = new AbstractC68683Kz(activity) { // from class: X.3LW
            public final Paint A00;

            {
                super(activity);
                Paint paint = new Paint(1);
                this.A00 = paint;
                paint.setColor(-16725026);
                this.A00.setStrokeWidth(activity.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_selection_border));
                this.A00.setStyle(Paint.Style.STROKE);
                this.A00.setAntiAlias(true);
            }

            @Override // android.widget.ImageView, android.view.View
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawColor(1711315404);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.A00);
                if (C2HT.this.A0B) {
                    canvas.drawColor(1727987712);
                }
            }

            @Override // android.widget.ImageView, android.view.View
            public void onMeasure(int i, int i2) {
                int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
                setMeasuredDimension(defaultSize, defaultSize);
            }
        };
        this.A09 = abstractC68683Kz;
        abstractC68683Kz.setSelected(true);
        this.A09.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A07.addView(this.A09);
    }
}
