package com.whatsapp.conversation;

import X.AbstractC005302j;
import X.AbstractC011205o;
import X.AbstractC49062Ih;
import X.AnonymousClass088;
import X.C000500h;
import X.C003101m;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C02L;
import X.C04250Jl;
import X.C06950Vu;
import X.C0AT;
import X.C0C8;
import X.C0D7;
import X.C0DW;
import X.C0GR;
import X.C2MG;
import X.C2MN;
import X.C54562ix;
import X.InterfaceC013706o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.text.CondensedTextView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ConversationAttachmentContentView extends AbstractC49062Ih {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public LinearLayout A08;
    public C02L A09;
    public C06950Vu A0A;
    public C01B A0B;
    public C54562ix A0C;
    public C000500h A0D;
    public C0C8 A0E;
    public AbstractC005302j A0F;
    public C0GR A0G;
    public C0DW A0H;
    public C2MN A0I;
    public C2MG A0J;
    public LinkedHashMap A0K;
    public boolean A0L;
    public boolean A0M;

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A02;
        int A022;
        this.A0K = new LinkedHashMap();
        this.A0M = false;
        this.A0M = this.A0B.A0E(C01C.A0P);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.attach_popup_icon_size);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.attach_popup_icon_bottom_margin);
        this.A04 = getIconTextViewHeight();
        if (this.A0M) {
            A02 = getResources().getDimensionPixelSize(R.dimen.conversation_attachment_edge_padding);
        } else {
            A02 = AnonymousClass088.A02(getContext(), 25.0f);
        }
        this.A00 = A02;
        if (this.A0M) {
            A022 = getResources().getDimensionPixelSize(R.dimen.conversation_attachment_item_padding);
        } else {
            A022 = AnonymousClass088.A02(getContext(), 8.0f);
        }
        this.A03 = A022;
        ScrollView.inflate(getContext(), R.layout.conversation_attachment_content_view, this);
        this.A08 = (LinearLayout) C0AT.A0D(this, R.id.row_content);
    }

    public int A00(View view) {
        if (this.A0M) {
            Point A0M = AnonymousClass088.A0M(getContext());
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return Math.max((getIconSize() * getNumberOfColumns()) + getMaxMarginSize(), (((view.getWidth() / 2) + iArr[0]) - (A0M.x / 2)) << 1);
        }
        return Integer.MAX_VALUE;
    }

    public int A01(View view) {
        int i;
        if (!this.A0M) {
            if (getResources().getConfiguration().orientation == 1) {
                i = this.A0D.A00.getInt("keyboard_height_portrait", 0);
            } else {
                i = this.A0D.A00.getInt("keyboard_height_landscape", 0);
            }
            return i == 0 ? (int) getResources().getDimension(R.dimen.conversation_attachment_container_max_height) : i;
        }
        int ceil = (int) Math.ceil(((AbstractCollection) A05()).size() / getNumberOfColumns());
        int i2 = (this.A00 << 1) + ((ceil - 1) * this.A03) + ((this.A02 + this.A01 + this.A04 + this.A05) * ceil);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int measuredHeight = (iArr[1] - view.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.attach_popup_min_top_offset);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new TypedValue().data, new int[]{16843499});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        int i3 = measuredHeight - dimensionPixelSize;
        return (i3 >= i2 || i2 - (this.A02 / 2) <= i3) ? i2 : i3;
    }

    public final Drawable A02(int i, int i2, int i3, int i4, boolean z) {
        int A00 = C02160Ac.A00(getContext(), i2);
        int A002 = C02160Ac.A00(getContext(), i);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A00, A002});
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(2);
        gradientDrawable.setGradientCenter(-1.0f, 0.5f);
        if (i3 > 0 && i4 > 0) {
            gradientDrawable.setSize(i3, i4);
        }
        if (z && Build.VERSION.SDK_INT >= 23) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(A002);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, shapeDrawable});
            layerDrawable.setLayerSize(1, i3 >> 2, i4 >> 2);
            layerDrawable.setLayerGravity(1, 17);
            return C02180Ae.A0P(getContext(), layerDrawable);
        }
        return C02180Ae.A0P(getContext(), gradientDrawable);
    }

    public final View A03(LinearLayout linearLayout, int i, int i2, int i3, int i4, int i5, boolean z, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        return A04(linearLayout, getContext().getResources().getDrawable(i), i2, i3, i4, i5, z, onClickListener, onLongClickListener);
    }

    public final View A04(LinearLayout linearLayout, Drawable drawable, int i, int i2, int i3, int i4, boolean z, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        if (this.A0M) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.conversation_attachment_picker_row_item_v2, (ViewGroup) linearLayout, false);
            ImageView imageView = (ImageView) C0AT.A0D(inflate, R.id.icon);
            TextView textView = (TextView) C0AT.A0D(inflate, R.id.text);
            if (z) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.attach_popup_icon_size);
                imageView.setBackgroundDrawable(A02(i2, i, dimensionPixelSize, dimensionPixelSize, z));
            } else {
                imageView.setBackgroundDrawable(A02(i2, i, 0, 0, false));
            }
            imageView.setImageDrawable(drawable);
            C0AT.A0V(imageView, 2);
            textView.setText(i3);
            inflate.setId(i4);
            imageView.setOnClickListener(onClickListener);
            inflate.setOnClickListener(onClickListener);
            if (onLongClickListener != null) {
                imageView.setOnLongClickListener(onLongClickListener);
                inflate.setOnLongClickListener(onLongClickListener);
            }
            return inflate;
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.conversation_attachment_picker_row_item, (ViewGroup) linearLayout, false);
        ((ImageView) C0AT.A0D(inflate2, R.id.icon)).setImageDrawable(drawable);
        ((TextView) C0AT.A0D(inflate2, R.id.text)).setText(i3);
        inflate2.setId(i4);
        inflate2.setOnClickListener(onClickListener);
        if (onLongClickListener != null) {
            inflate2.setOnLongClickListener(onLongClickListener);
        }
        return inflate2;
    }

    public final List A05() {
        boolean A06;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (this.A0H.A02() && !this.A09.A0A(this.A0F)) {
            AbstractC005302j abstractC005302j = this.A0F;
            if (!C003101m.A0P(abstractC005302j)) {
                if (C003101m.A0U(abstractC005302j)) {
                    Iterator it = this.A0E.A01((AbstractC011205o) abstractC005302j).A05().iterator();
                    while (true) {
                        C04250Jl c04250Jl = (C04250Jl) it;
                        if (c04250Jl.hasNext()) {
                            C02L c02l = this.A09;
                            UserJid userJid = ((C0D7) c04250Jl.next()).A03;
                            if (!c02l.A0A(userJid) && this.A0H.A06(userJid)) {
                                A06 = true;
                                break;
                            }
                        } else {
                            A06 = false;
                            break;
                        }
                    }
                } else {
                    A06 = this.A0H.A06(UserJid.of(abstractC005302j));
                }
                InterfaceC013706o A01 = this.A0G.A01();
                if (A01 != null) {
                    CharSequence A9L = A01.A9L(getContext());
                    if (A06 && !TextUtils.isEmpty(A9L)) {
                        z = true;
                    }
                } else {
                    throw null;
                }
            }
        }
        boolean A05 = this.A0A.A05();
        if (this.A0M) {
            arrayList.add("document");
            arrayList.add("camera");
            arrayList.add("gallery");
            arrayList.add("audio");
            if (z) {
                arrayList.add("payment");
            }
            if (A05) {
                arrayList.add("room");
            }
            arrayList.add("location");
            arrayList.add("contact");
            return arrayList;
        }
        arrayList.add("document");
        if (z) {
            arrayList.add("payment");
        } else if (!A05) {
            arrayList.add("camera");
        } else {
            arrayList.add("room");
        }
        arrayList.add("gallery");
        arrayList.add("audio");
        arrayList.add("location");
        arrayList.add("contact");
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0074, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06() {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A06():void");
    }

    public void A07(int i, boolean z) {
        boolean z2 = true;
        int[][] iArr = new int[3];
        int[] iArr2 = {6, 0, 0, 0};
        if (z) {
            // fill-array-data instruction
            iArr2[0] = 2;
            iArr2[1] = 3;
            iArr2[2] = 6;
            iArr2[3] = 8;
            iArr[0] = iArr2;
            iArr[1] = new int[]{3, 6, 0, 0};
            iArr[2] = new int[]{6, 0, 0, 0};
        } else {
            iArr[0] = iArr2;
            iArr[1] = new int[]{3, 6, 0, 0};
            iArr[2] = new int[]{2, 3, 6, 8};
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A0K.entrySet()) {
            arrayList.add(entry.getValue());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = 0;
            while (i4 < iArr[i3].length) {
                if (i4 < getNumberOfColumns() && i2 < arrayList.size()) {
                    View view = (View) arrayList.get(i2);
                    int i5 = iArr[i3][i4];
                    AnimationSet animationSet = new AnimationSet(z2);
                    animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, z2 ? 1 : 0, z ? 1.0f : 0.0f));
                    animationSet.setInterpolator(new OvershootInterpolator(1.0f));
                    animationSet.setDuration(300L);
                    animationSet.setStartOffset(i5 == 0 ? 0L : i / i5);
                    view.startAnimation(animationSet);
                    i2++;
                }
                i4++;
                z2 = true;
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - getHeight();
        int i = this.A06;
        int i2 = computeVerticalScrollRange - (i << 1);
        return (i <= 0 || i2 <= 0) ? computeVerticalScrollOffset : ((computeVerticalScrollOffset * i2) / computeVerticalScrollRange) + i;
    }

    private int getIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.quickaction_button_h);
    }

    private int getIconTextViewHeight() {
        CondensedTextView condensedTextView = new CondensedTextView(getContext(), null, R.style.AttachPickerLabelV2);
        condensedTextView.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return condensedTextView.getMeasuredHeight();
    }

    private int getMaxMarginSize() {
        return (getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_max_padding) << 1) + getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_margin);
    }

    private int getMinMarginSize() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_min_padding);
        getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_max_padding);
        return (dimensionPixelSize << 1) + getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_margin);
    }

    private int getNumberOfColumns() {
        Point A0M = AnonymousClass088.A0M(this.A08.getContext());
        return Math.min(4, Math.max(3, (A0M.x - getMinMarginSize()) / getIconSize()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d8, code lost:
        if (java.lang.Math.abs(r5) < java.lang.Math.abs(r4)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f4, code lost:
        if (java.lang.Math.abs(r5) < java.lang.Math.abs(r4)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f6, code lost:
        r4 = r5;
     */
    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.onMeasure(int, int):void");
    }

    public void setVerticalScrollbarInset(int i) {
        this.A06 = i;
    }
}
