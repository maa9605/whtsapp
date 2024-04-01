package X;

import android.content.Context;
import android.os.Build;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.2Zf */
/* loaded from: classes2.dex */
public class C2Zf extends AbstractC51982Zg {
    public int A00;
    public LinearLayout A01;
    public C01B A02;
    public ThumbnailButton A03;

    public C2Zf(Context context) {
        super(context);
        LinearLayout.inflate(getContext(), R.layout.call_avatar_view, this);
        setOrientation(1);
        setGravity(1);
        this.A01 = (LinearLayout) findViewById(R.id.contact_photo_layout);
        ThumbnailButton thumbnailButton = (ThumbnailButton) findViewById(R.id.contact_photo);
        this.A03 = thumbnailButton;
        if (thumbnailButton != null && !AnonymousClass029.A1O(this.A02)) {
            this.A03.setShouldShowShadow(true);
            this.A03.A03 = getResources().getColor(R.color.white_20);
            this.A03.A01 = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo_border_size);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A03.setElevation(getResources().getDimensionPixelOffset(R.dimen.call_avatar_view_elevation));
            }
        }
        this.A00 = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation);
    }

    public int A00(int i) {
        if (i == 1) {
            return getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo_with_two_participants);
        if (i >= 2) {
            return dimensionPixelSize - (getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo_participants_difference) * (i - 2));
        }
        return 0;
    }

    public ThumbnailButton getContactPhoto() {
        return this.A03;
    }

    public LinearLayout getContactPhotoLayout() {
        return this.A01;
    }
}
