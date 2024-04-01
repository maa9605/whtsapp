package com.google.android.exoplayer2.ui;

import X.C221711h;
import X.InterfaceC223011w;
import X.View$OnClickListenerC223111x;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public C221711h A00;
    public InterfaceC223011w A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final LayoutInflater A05;
    public final CheckedTextView A06;
    public final CheckedTextView A07;
    public final View$OnClickListenerC223111x A08;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.11x] */
    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.A04 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.A05 = LayoutInflater.from(context);
        this.A08 = new View.OnClickListener() { // from class: X.11x
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
                if (r6.A00 != null) goto L11;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onClick(android.view.View r12) {
                /*
                    r11 = this;
                    com.google.android.exoplayer2.ui.TrackSelectionView r6 = com.google.android.exoplayer2.ui.TrackSelectionView.this
                    android.widget.CheckedTextView r5 = r6.A07
                    r7 = 0
                    r3 = 1
                    if (r12 != r5) goto L22
                    r6.A03 = r3
                    r6.A00 = r7
                Lc:
                    boolean r0 = r6.A03
                    r5.setChecked(r0)
                    android.widget.CheckedTextView r2 = r6.A06
                    boolean r0 = r6.A03
                    if (r0 != 0) goto L1c
                    X.11h r1 = r6.A00
                    r0 = 1
                    if (r1 == 0) goto L1d
                L1c:
                    r0 = 0
                L1d:
                    r2.setChecked(r0)
                    r0 = 0
                    throw r0
                L22:
                    android.widget.CheckedTextView r0 = r6.A06
                    r10 = 0
                    r6.A03 = r10
                    if (r12 != r0) goto L2c
                    r6.A00 = r7
                    goto Lc
                L2c:
                    java.lang.Object r1 = r12.getTag()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r0 = r1.first
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r4 = r0.intValue()
                    java.lang.Object r0 = r1.second
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r8 = r0.intValue()
                    X.11h r2 = r6.A00
                    if (r2 == 0) goto L91
                    int r0 = r2.A00
                    if (r0 != r4) goto L91
                    boolean r0 = r6.A02
                    if (r0 == 0) goto L91
                    int r1 = r2.A01
                    int[] r9 = r2.A02
                    android.widget.CheckedTextView r12 = (android.widget.CheckedTextView) r12
                    boolean r0 = r12.isChecked()
                    if (r0 == 0) goto L7d
                    if (r1 != r3) goto L61
                    r6.A00 = r7
                    r6.A03 = r3
                    goto Lc
                L61:
                    int r7 = r9.length
                    int r0 = r7 + (-1)
                    int[] r3 = new int[r0]
                    r2 = 0
                L67:
                    if (r10 >= r7) goto L75
                    r1 = r9[r10]
                    if (r1 == r8) goto L72
                    int r0 = r2 + 1
                    r3[r2] = r1
                    r2 = r0
                L72:
                    int r10 = r10 + 1
                    goto L67
                L75:
                    X.11h r0 = new X.11h
                    r0.<init>(r4, r3)
                    r6.A00 = r0
                    goto Lc
                L7d:
                    int r0 = r9.length
                    int r0 = r0 + r3
                    int[] r1 = java.util.Arrays.copyOf(r9, r0)
                    int r0 = r1.length
                    int r0 = r0 + (-1)
                    r1[r0] = r8
                    X.11h r0 = new X.11h
                    r0.<init>(r4, r1)
                    r6.A00 = r0
                    goto Lc
                L91:
                    int[] r1 = new int[r3]
                    r1[r10] = r8
                    X.11h r0 = new X.11h
                    r0.<init>(r4, r1)
                    r6.A00 = r0
                    goto Lc
                */
                throw new UnsupportedOperationException("Method not decompiled: X.View$OnClickListenerC223111x.onClick(android.view.View):void");
            }
        };
        final Resources resources = getResources();
        this.A01 = new InterfaceC223011w(resources) { // from class: X.1a3
            public final Resources A00;

            {
                if (resources != null) {
                    this.A00 = resources;
                    return;
                }
                throw null;
            }
        };
        CheckedTextView checkedTextView = (CheckedTextView) this.A05.inflate(17367055, (ViewGroup) this, false);
        this.A07 = checkedTextView;
        checkedTextView.setBackgroundResource(this.A04);
        this.A07.setText(R.string.exo_track_selection_none);
        this.A07.setEnabled(false);
        this.A07.setFocusable(true);
        this.A07.setOnClickListener(this.A08);
        this.A07.setVisibility(8);
        addView(this.A07);
        addView(this.A05.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) this.A05.inflate(17367055, (ViewGroup) this, false);
        this.A06 = checkedTextView2;
        checkedTextView2.setBackgroundResource(this.A04);
        this.A06.setText(R.string.exo_track_selection_auto);
        this.A06.setEnabled(false);
        this.A06.setFocusable(true);
        this.A06.setOnClickListener(this.A08);
        addView(this.A06);
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 3) {
                    removeViewAt(childCount);
                } else {
                    this.A07.setEnabled(false);
                    this.A06.setEnabled(false);
                    return;
                }
            }
        }
    }

    public void setShowDisableOption(boolean z) {
        this.A07.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC223011w interfaceC223011w) {
        if (interfaceC223011w != null) {
            this.A01 = interfaceC223011w;
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 3) {
                    removeViewAt(childCount);
                } else {
                    this.A07.setEnabled(false);
                    this.A06.setEnabled(false);
                    return;
                }
            }
        } else {
            throw null;
        }
    }
}
