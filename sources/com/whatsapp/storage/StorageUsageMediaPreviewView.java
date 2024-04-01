package com.whatsapp.storage;

import X.AbstractC53492h0;
import X.C011605s;
import X.C02160Ac;
import X.C02180Ae;
import X.C2ZG;
import X.C51662Xi;
import X.C51682Xk;
import X.C52132a7;
import X.C83273rr;
import X.InterfaceC61152vg;
import X.InterfaceC61162vh;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageMediaPreviewView;
import java.util.List;

/* loaded from: classes2.dex */
public class StorageUsageMediaPreviewView extends C2ZG {
    public static final Bitmap A09 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public int A00;
    public C011605s A01;
    public String A02;
    public List A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Drawable A07;
    public final C52132a7 A08;

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.storage_preview_item_thumb_space);
        this.A04 = getResources().getDimensionPixelSize(R.dimen.storage_preview_item_thumb_size);
        int A00 = C02160Ac.A00(getContext(), R.color.gallery_cell);
        this.A05 = A00;
        this.A07 = new ColorDrawable(A00);
        this.A08 = new C52132a7(this.A01, context.getContentResolver(), new Handler(Looper.getMainLooper()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A03 == null || this.A02 == null) {
            return;
        }
        post(new RunnableEBaseShape7S0100000_I0_7(this, 9));
    }

    public void setPreviewMediaItems(final List list, final int i, final String str) {
        this.A03 = list;
        this.A00 = i;
        this.A02 = str;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        if (getMeasuredWidth() == 0) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.3Yc
                {
                    StorageUsageMediaPreviewView.this = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    StorageUsageMediaPreviewView.this.setPreviewMediaItemsInternal(list, i, str);
                    view.removeOnLayoutChangeListener(this);
                }
            });
        } else {
            setPreviewMediaItemsInternal(list, i, str);
        }
    }

    public final void setPreviewMediaItemsInternal(List list, int i, final String str) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final C51682Xk c51682Xk;
        int measuredWidth = getMeasuredWidth();
        int i2 = this.A04;
        int i3 = ((i2 >> 1) + measuredWidth) / i2;
        int measuredWidth2 = getMeasuredWidth();
        int i4 = this.A06;
        final int i5 = (measuredWidth2 - ((i3 - 1) * i4)) / i3;
        int min = Math.min(list.size(), i3);
        Context context = getContext();
        if (context != null) {
            Drawable A0L = C02180Ae.A0L(context);
            for (int i6 = 0; i6 < min; i6++) {
                final AbstractC53492h0 abstractC53492h0 = (AbstractC53492h0) list.get(i6);
                if (i6 == min - 1 && i > min) {
                    C51682Xk c51682Xk2 = new C51682Xk(getContext());
                    C83273rr c83273rr = new C83273rr(getContext());
                    int i7 = i - min;
                    View view = c83273rr.A00;
                    if (view != null) {
                        c83273rr.removeView(view);
                    }
                    c83273rr.addView(c51682Xk2, 0);
                    c83273rr.A00 = c51682Xk2;
                    c83273rr.A03.setText(c83273rr.getContext().getString(R.string.storage_usage_preview_overlay_text, Integer.valueOf(i7)));
                    c83273rr.setFrameDrawable(A0L);
                    addView(c83273rr);
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) c83273rr.getLayoutParams();
                    c51682Xk = c51682Xk2;
                } else {
                    C51662Xi c51662Xi = new C51662Xi(getContext());
                    c51662Xi.A00 = 3;
                    c51662Xi.setFrameDrawable(A0L);
                    addView(c51662Xi);
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) c51662Xi.getLayoutParams();
                    c51682Xk = c51662Xi;
                }
                if (i6 != 0) {
                    marginLayoutParams.leftMargin = i4;
                }
                marginLayoutParams.width = i5;
                marginLayoutParams.height = i5;
                c51682Xk.setMediaItem(abstractC53492h0);
                c51682Xk.setScaleType(ImageView.ScaleType.CENTER_CROP);
                c51682Xk.setSelector(null);
                C52132a7 c52132a7 = this.A08;
                c52132a7.A01((InterfaceC61152vg) c51682Xk.getTag());
                final InterfaceC61152vg interfaceC61152vg = new InterfaceC61152vg() { // from class: X.3rs
                    @Override // X.InterfaceC61152vg
                    public String ADR() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(abstractC53492h0.A03);
                        sb.append(str);
                        return sb.toString();
                    }

                    @Override // X.InterfaceC61152vg
                    public Bitmap AG1() {
                        Bitmap AVV = abstractC53492h0.AVV(i5);
                        return AVV == null ? StorageUsageMediaPreviewView.A09 : AVV;
                    }
                };
                c51682Xk.setTag(interfaceC61152vg);
                c52132a7.A02(interfaceC61152vg, new InterfaceC61162vh() { // from class: X.3rt
                    @Override // X.InterfaceC61162vh
                    public /* synthetic */ void AKC() {
                    }

                    {
                        StorageUsageMediaPreviewView.this = this;
                    }

                    @Override // X.InterfaceC61162vh
                    public void A5d() {
                        C51682Xk c51682Xk3 = c51682Xk;
                        c51682Xk3.setBackgroundColor(StorageUsageMediaPreviewView.this.A05);
                        c51682Xk3.setImageDrawable(null);
                    }

                    @Override // X.InterfaceC61162vh
                    public void APF(Bitmap bitmap, boolean z) {
                        Bitmap bitmap2 = bitmap;
                        C51682Xk c51682Xk3 = c51682Xk;
                        if (c51682Xk3.getTag() == interfaceC61152vg) {
                            AbstractC53492h0 abstractC53492h02 = abstractC53492h0;
                            if (bitmap == StorageUsageMediaPreviewView.A09) {
                                bitmap2 = null;
                            }
                            StorageUsageMediaPreviewView storageUsageMediaPreviewView = StorageUsageMediaPreviewView.this;
                            C43981yK.A0D(c51682Xk3, abstractC53492h02, bitmap2, storageUsageMediaPreviewView.A05, storageUsageMediaPreviewView.A07, !z);
                        }
                    }
                });
            }
            return;
        }
        throw null;
    }
}
