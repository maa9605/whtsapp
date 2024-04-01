package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.components.button.ThumbnailPickerButton;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.status.ContactStatusThumbnail;

/* renamed from: X.2Vp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC51262Vp extends WaImageView {
    public boolean A00;

    public AbstractC51262Vp(Context context) {
        super(context);
        A00();
    }

    public AbstractC51262Vp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    @Override // X.AbstractC08140aj
    public void A00() {
        if (this instanceof C2Z7) {
            C2Z7 c2z7 = (C2Z7) this;
            if (c2z7.A00) {
                return;
            }
            c2z7.A00 = true;
            ((AbstractC07960aN) c2z7.generatedComponent()).A2g((ContactStatusThumbnail) c2z7);
        } else if (this instanceof AbstractC51742Xr) {
            AbstractC51742Xr abstractC51742Xr = (AbstractC51742Xr) this;
            if (abstractC51742Xr.A00) {
                return;
            }
            abstractC51742Xr.A00 = true;
            ((AbstractC07960aN) abstractC51742Xr.generatedComponent()).A1l((ContactLiveLocationThumbnail) abstractC51742Xr);
        } else if (this instanceof AbstractC51292Vu) {
            AbstractC51292Vu abstractC51292Vu = (AbstractC51292Vu) this;
            if (abstractC51292Vu.A00) {
                return;
            }
            abstractC51292Vu.A00 = true;
            ((AbstractC07960aN) abstractC51292Vu.generatedComponent()).A0i((C51282Vt) abstractC51292Vu);
        } else if (!(this instanceof AbstractC51272Vs)) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            ((AbstractC07960aN) generatedComponent()).A0g((ThumbnailButton) this);
        } else {
            AbstractC51272Vs abstractC51272Vs = (AbstractC51272Vs) this;
            if (abstractC51272Vs.A00) {
                return;
            }
            abstractC51272Vs.A00 = true;
            ((AbstractC07960aN) abstractC51272Vs.generatedComponent()).A0h((ThumbnailPickerButton) abstractC51272Vs);
        }
    }
}
