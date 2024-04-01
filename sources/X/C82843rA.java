package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3rA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82843rA extends C0TS {
    public View.OnLongClickListener A00;
    public C0JM A01;
    public boolean A02;
    public boolean A03;
    public final View.OnLongClickListener A04;
    public final C43791xz A05;
    public final InterfaceC53342en A06;
    public final StickerView A07;
    public final Integer A08;

    public C82843rA(C43791xz c43791xz, LayoutInflater layoutInflater, ViewGroup viewGroup, InterfaceC53342en interfaceC53342en, Integer num) {
        super(layoutInflater.inflate(R.layout.sticker_picker_item, viewGroup, false));
        this.A04 = new View.OnLongClickListener() { // from class: X.3YA
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                View.OnLongClickListener onLongClickListener = C82843rA.this.A00;
                if (onLongClickListener != null) {
                    return onLongClickListener.onLongClick(view);
                }
                return false;
            }
        };
        this.A05 = c43791xz;
        this.A06 = interfaceC53342en;
        this.A08 = num;
        StickerView stickerView = (StickerView) this.A0H.findViewById(R.id.sticker_view);
        this.A07 = stickerView;
        stickerView.A02 = true;
    }

    public void A0C(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            if (z && this.A03) {
                StickerView stickerView = this.A07;
                stickerView.A03 = true;
                stickerView.A00();
                return;
            }
            StickerView stickerView2 = this.A07;
            stickerView2.A03 = false;
            stickerView2.A01();
        }
    }
}
