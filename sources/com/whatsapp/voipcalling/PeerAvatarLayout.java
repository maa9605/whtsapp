package com.whatsapp.voipcalling;

import X.AbstractC52022Zo;
import X.C002301c;
import X.C0L5;
import X.C0Zn;
import X.C84653u6;
import X.InterfaceC52362ab;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class PeerAvatarLayout extends AbstractC52022Zo {
    public int A00;
    public int A01;
    public C0Zn A02;
    public C0L5 A03;
    public C002301c A04;
    public C84653u6 A05;
    public final InterfaceC52362ab A06;

    public PeerAvatarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A06 = new InterfaceC52362ab() { // from class: X.3u4
            @Override // X.InterfaceC52362ab
            public void AUd(ImageView imageView, Bitmap bitmap, boolean z) {
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageResource(R.drawable.avatar_contact);
                }
            }

            @Override // X.InterfaceC52362ab
            public void AUp(ImageView imageView) {
                imageView.setImageResource(R.drawable.avatar_contact);
            }
        };
        this.A05 = new C84653u6(this);
        NonScrollingLinearLayoutManager nonScrollingLinearLayoutManager = new NonScrollingLinearLayoutManager();
        nonScrollingLinearLayoutManager.A1Y(0);
        setLayoutManager(nonScrollingLinearLayoutManager);
        setAdapter(this.A05);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation_difference);
        this.A02 = this.A03.A03(getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo_quality), 0.0f);
    }

    /* loaded from: classes2.dex */
    public class NonScrollingLinearLayoutManager extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
        public boolean A1A() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
        public boolean A1B() {
            return false;
        }

        public NonScrollingLinearLayoutManager() {
            super(1);
        }
    }
}
