package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.2im  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54462im {
    public float A00;
    public View A01;
    public ImageView A02;
    public AnonymousClass097 A03;
    public final ImageView A04;
    public final LinearLayout A05;
    public final TextView A06;
    public final C58892rs A07;
    public final StickerView A08;
    public final /* synthetic */ C2XA A09;

    public C54462im(C2XA c2xa, View view) {
        this.A09 = c2xa;
        this.A08 = (StickerView) view.findViewById(R.id.sticker_image);
        this.A06 = (TextView) view.findViewById(R.id.date);
        this.A04 = (ImageView) view.findViewById(R.id.status);
        this.A07 = new C58892rs(view, c2xa.A05, ((AbstractC48182Ef) c2xa).A0J, ((AbstractC48182Ef) c2xa).A0K, ((AbstractC48182Ef) c2xa).A0N, ((AbstractC48202Eh) c2xa).A0J, c2xa.A11, c2xa.A02, c2xa.A04, c2xa.A03);
        this.A05 = (LinearLayout) view.findViewById(R.id.date_wrapper);
    }

    public final void A00() {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        final Context context = this.A09.getContext();
        View view2 = new View(context) { // from class: X.2rt
            public final Rect A00 = new Rect();

            @Override // android.view.View
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (isSelected()) {
                    C54462im c54462im = C54462im.this;
                    StickerView stickerView = c54462im.A08;
                    Rect rect = this.A00;
                    stickerView.getDrawingRect(rect);
                    canvas.drawRect(rect, ((AbstractC48202Eh) c54462im.A09).A0X.A01);
                }
            }

            @Override // android.view.View
            public void onMeasure(int i, int i2) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                StickerView stickerView = C54462im.this.A08;
                int measuredHeight = stickerView.getMeasuredHeight();
                int measuredWidth = stickerView.getMeasuredWidth();
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size = Math.min(measuredWidth, size);
                    } else {
                        size = measuredWidth;
                    }
                }
                if (mode2 != 1073741824) {
                    if (mode2 == Integer.MIN_VALUE) {
                        size2 = Math.min(size2, measuredHeight);
                    } else {
                        size2 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.A01 = view2;
        view2.setClickable(true);
        this.A01.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 19));
        ((ViewGroup) this.A08.getParent()).addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    public void A01(final AnonymousClass097 anonymousClass097, boolean z) {
        ImageView imageView;
        boolean z2;
        this.A03 = anonymousClass097;
        C2XA c2xa = this.A09;
        final InterfaceC04690Ll rowsContainer = c2xa.getRowsContainer();
        if (rowsContainer != null && rowsContainer.AEZ()) {
            A00();
            this.A01.setSelected(c2xa.getRowsContainer().AFX(anonymousClass097));
        } else {
            View view = this.A01;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        ColorStateList colorStateList = null;
        if (anonymousClass097 != null) {
            if (z) {
                if (rowsContainer != null) {
                    z2 = rowsContainer.AFv(anonymousClass097);
                    StickerView stickerView = this.A07.A0M;
                    if (z2) {
                        stickerView.A01 = new AbstractC09660eW() { // from class: X.38h
                            @Override // X.AbstractC09660eW
                            public void A00(Drawable drawable) {
                                if (drawable instanceof C44121yY) {
                                    InterfaceC04690Ll.this.AVt(anonymousClass097);
                                }
                            }
                        };
                    } else {
                        stickerView.A01 = null;
                    }
                } else {
                    z2 = false;
                }
                this.A07.A08 = z2;
            }
            C58892rs c58892rs = this.A07;
            c58892rs.A03((C04040Ie) anonymousClass097, z);
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                this.A06.setText(AbstractC40621sZ.A00(((AbstractC48202Eh) c2xa).A0J, ((AbstractC48182Ef) c2xa).A0X.A06(anonymousClass097.A0E)));
                LinearLayout linearLayout = this.A05;
                if (linearLayout != null) {
                    if (anonymousClass097.A0j) {
                        if (this.A02 == null) {
                            this.A02 = new ImageView(c2xa.getContext());
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 16;
                            this.A02.setLayoutParams(layoutParams);
                            C0LX.A06(((AbstractC48202Eh) c2xa).A0J, this.A02, 0, c2xa.getResources().getDimensionPixelSize(R.dimen.star_padding));
                            linearLayout.addView(this.A02, 0);
                            linearLayout.setClipChildren(false);
                        }
                        this.A02.setImageDrawable(c2xa.getStarDrawable());
                        this.A02.setVisibility(0);
                    } else {
                        ImageView imageView2 = this.A02;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                    }
                }
                AnonymousClass094 anonymousClass094 = anonymousClass097.A0n;
                boolean z3 = anonymousClass094.A02;
                if (z3 && (imageView = this.A04) != null) {
                    int A0C = c2xa.A0C(((AnonymousClass092) anonymousClass097).A08);
                    int A0D = c2xa.A0D(((AnonymousClass092) anonymousClass097).A08);
                    if (A0D != 0) {
                        colorStateList = C02160Ac.A02(c2xa.getContext(), A0D);
                    }
                    C07O.A0h(imageView, colorStateList);
                    imageView.setImageResource(A0C);
                }
                if (c09h.A0a && !c09h.A0Y) {
                    c58892rs.A01();
                } else if ((c09h.A0P && (!c09h.A0X || z3)) || (anonymousClass097.A0f && z3 && !C003101m.A0P(anonymousClass094.A00))) {
                    c58892rs.A02();
                } else {
                    c58892rs.A00();
                }
                this.A08.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2rL
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        C54462im c54462im = C54462im.this;
                        InterfaceC04690Ll interfaceC04690Ll = rowsContainer;
                        AnonymousClass097 anonymousClass0972 = anonymousClass097;
                        if (interfaceC04690Ll != null) {
                            interfaceC04690Ll.AV2(c54462im.A03);
                            c54462im.A00();
                            c54462im.A01.setSelected(interfaceC04690Ll.AFX(anonymousClass0972));
                            return true;
                        }
                        return true;
                    }
                });
                return;
            }
            throw null;
        }
        StickerView stickerView2 = this.A08;
        stickerView2.setImageDrawable(null);
        stickerView2.setOnLongClickListener(null);
    }
}
