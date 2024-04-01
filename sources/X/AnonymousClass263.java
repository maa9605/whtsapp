package X;

import android.content.DialogInterface;
import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;

/* renamed from: X.263  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass263 {
    public final /* synthetic */ StickerStorePackPreviewActivity A00;

    public AnonymousClass263(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        this.A00 = stickerStorePackPreviewActivity;
    }

    public void A00() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A00;
        if (!stickerStorePackPreviewActivity.A0U || stickerStorePackPreviewActivity.isFinishing() || Build.VERSION.SDK_INT < 17 || stickerStorePackPreviewActivity.isDestroyed()) {
            return;
        }
        C019208x c019208x = new C019208x(stickerStorePackPreviewActivity);
        c019208x.A02(R.string.sticker_pack_not_found);
        c019208x.A06(R.string.ok, null);
        c019208x.A01.A07 = new DialogInterface.OnDismissListener() { // from class: X.3Xx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AnonymousClass263.this.A01();
            }
        };
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setCanceledOnTouchOutside(true);
        A00.show();
    }

    public /* synthetic */ void A01() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A00;
        if (stickerStorePackPreviewActivity.isFinishing() || Build.VERSION.SDK_INT < 17 || stickerStorePackPreviewActivity.isDestroyed()) {
            return;
        }
        stickerStorePackPreviewActivity.finish();
    }
}
