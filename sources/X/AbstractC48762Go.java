package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.ViewOnClickCListenerShape0S0000000_I0;

/* renamed from: X.2Go */
/* loaded from: classes2.dex */
public abstract class AbstractC48762Go extends AbstractC48772Gp {
    public View A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public RelativeLayout A08;
    public C002301c A09;
    public C003701t A0A;
    public AnonymousClass302 A0B;
    public AnonymousClass302 A0C;
    public AnonymousClass302 A0D;

    public abstract View getStartingViewFromToolbarExtra();

    public abstract void setBackButtonDrawable(int i);

    public AbstractC48762Go(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AbstractC48762Go(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }

    public void A01() {
        this.A05.setAlpha(0.5f);
        this.A07.setAlpha(0.5f);
        this.A03.setAlpha(0.5f);
    }

    public void A02() {
        this.A05.setAlpha(1.0f);
        this.A07.setAlpha(1.0f);
        this.A03.setAlpha(1.0f);
    }

    public void A03(final C48752Gn c48752Gn) {
        this.A02 = (ImageView) C0AT.A0D(this, R.id.back);
        this.A08 = (RelativeLayout) C0AT.A0D(this, R.id.tool_bar_extra);
        this.A01 = C0AT.A0D(this, R.id.undo);
        this.A00 = C0AT.A0D(this, R.id.title_bar);
        this.A05 = (ImageView) C0AT.A0D(this, R.id.pen);
        this.A06 = (ImageView) C0AT.A0D(this, R.id.shape);
        this.A07 = (ImageView) C0AT.A0D(this, R.id.text);
        this.A03 = (ImageView) C0AT.A0D(this, R.id.crop);
        this.A04 = (ImageView) C0AT.A0D(this, R.id.delete);
        this.A0B = new AnonymousClass302(getContext(), this.A0A, R.drawable.ic_cam_draw);
        this.A0C = new AnonymousClass302(getContext(), this.A0A, R.drawable.ic_cam_sticker);
        this.A0D = new AnonymousClass302(getContext(), this.A0A, R.drawable.ic_cam_text);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (((int) (displayMetrics.widthPixels / displayMetrics.density)) < 360) {
            this.A02.setPadding(0, 0, 0, 0);
            this.A04.setPadding(0, 0, 0, 0);
            this.A03.setPadding(0, 0, 0, 0);
            this.A01.setPadding(0, 0, 0, 0);
        }
        this.A05.setImageDrawable(this.A0B);
        this.A06.setImageDrawable(this.A0C);
        this.A07.setImageDrawable(this.A0D);
        ImageView imageView = this.A02;
        imageView.setImageDrawable(new C0We(this.A09, imageView.getDrawable()));
        this.A02.setOnClickListener(new ViewOnClickCListenerShape0S0000000_I0(this, 1));
        this.A01.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(c48752Gn, 3));
        this.A01.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.30k
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C48752Gn c48752Gn2 = c48752Gn;
                C48742Gm c48742Gm = c48752Gn2.A03;
                if (c48742Gm == null || c48752Gn2.A02 == null) {
                    return true;
                }
                DoodleView doodleView = c48742Gm.A0G;
                doodleView.A0I.A01();
                doodleView.A0F.A0D = false;
                doodleView.invalidate();
                c48742Gm.A0I.A02 = false;
                c48742Gm.A0N.A07(0);
                c48752Gn2.A0B.A01.setVisibility(8);
                c48752Gn2.A02.A02();
                c48752Gn2.A03.A05();
                return true;
            }
        });
        this.A05.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(c48752Gn, 2));
        this.A06.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(c48752Gn, 6));
        this.A03.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(c48752Gn, 5));
        this.A07.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(c48752Gn, 4));
        this.A04.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(c48752Gn, 1));
    }

    public final int getCropToolId() {
        return this.A03.getId();
    }

    public final int getPenToolId() {
        return this.A05.getId();
    }

    public final int getShapeToolId() {
        return this.A06.getId();
    }

    public final int getTextToolId() {
        return this.A07.getId();
    }

    public final RelativeLayout getToolbarExtra() {
        return this.A08;
    }

    public final void setCropToolVisibility(int i) {
        this.A03.setVisibility(i);
    }

    public final void setDeleteButtonVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public void setPenToolDrawableStrokePreview(boolean z) {
        this.A0B.A04 = z;
    }

    public void setShapeToolDrawableStrokePreview(boolean z) {
        this.A0C.A04 = z;
    }

    public void setToolBarExtra(RelativeLayout relativeLayout) {
        this.A08 = relativeLayout;
    }

    public final void setToolbarExtraVisibility(int i) {
        this.A08.setVisibility(i);
    }

    public final void setUndoButtonVisibility(int i) {
        this.A01.setVisibility(i);
    }
}
