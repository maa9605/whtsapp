package com.whatsapp.location;

import X.C019609c;
import X.C06390Sx;
import X.C0K0;
import X.C0KC;
import X.C0KD;
import X.C0SD;
import X.C18690uA;
import X.C18L;
import X.C2HX;
import X.C31861d4;
import X.C41471ty;
import X.InterfaceC18440tk;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.RemoteException;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.WaMapView;

/* loaded from: classes2.dex */
public class WaMapView extends C2HX {
    public static C18690uA A02;
    public static C019609c A03;
    public C06390Sx A00;
    public C0SD A01;

    public WaMapView(Context context) {
        super(context);
    }

    public WaMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A00(final LatLng latLng) {
        final String string = getContext().getString(R.string.location_marker_content_description);
        C0SD c0sd = this.A01;
        if (c0sd != null) {
            c0sd.A06(new C18L() { // from class: X.3EN
                @Override // X.C18L
                public final void ALk(C0S8 c0s8) {
                    LatLng latLng2 = latLng;
                    String str = string;
                    C019609c c019609c = WaMapView.A03;
                    if (c019609c == null) {
                        try {
                            InterfaceC019509b interfaceC019509b = AnonymousClass088.A01;
                            C07K.A1Q(interfaceC019509b, "IBitmapDescriptorFactory is not initialized");
                            c019609c = new C019609c(interfaceC019509b.AWf(R.drawable.ic_map_pin));
                            WaMapView.A03 = c019609c;
                        } catch (RemoteException e) {
                            throw new C09Y(e);
                        }
                    }
                    C31871d5 c31871d5 = new C31871d5();
                    if (latLng2 != null) {
                        c31871d5.A08 = latLng2;
                        c31871d5.A07 = c019609c;
                        c31871d5.A09 = str;
                        if (c0s8 != null) {
                            try {
                                c0s8.A01.clear();
                                c0s8.A03(c31871d5);
                                return;
                            } catch (RemoteException e2) {
                                throw new C09Y(e2);
                            }
                        }
                        throw null;
                    }
                    throw new IllegalArgumentException("latlng cannot be null - a position is required.");
                }
            });
            return;
        }
        C06390Sx c06390Sx = this.A00;
        if (c06390Sx == null) {
            return;
        }
        c06390Sx.A0H(new InterfaceC18440tk() { // from class: X.3EL
            @Override // X.InterfaceC18440tk
            public final void ALj(C0T4 c0t4) {
                LatLng latLng2 = latLng;
                String str = string;
                if (WaMapView.A02 == null) {
                    WaMapView.A02 = C08N.A02 == null ? null : C08N.A01(C000200d.A0D("resource_", R.drawable.ic_map_pin), new InterfaceC18700uB() { // from class: X.1XB
                        public final /* synthetic */ int A00 = R.drawable.ic_map_pin;

                        @Override // X.InterfaceC18700uB
                        public Bitmap A6j() {
                            return BitmapFactory.decodeResource(C08N.A02.getResources(), this.A00);
                        }
                    });
                }
                C18750uG c18750uG = new C18750uG();
                c18750uG.A02 = new C016007m(latLng2.A00, latLng2.A01);
                c18750uG.A01 = WaMapView.A02;
                c18750uG.A04 = str;
                c0t4.A05();
                C0SJ c0sj = new C0SJ(c0t4, c18750uG);
                c0t4.A09(c0sj);
                c0sj.A0I = c0t4;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x000f, code lost:
        if (r14.A00 != 0.0d) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.C41471ty r13, final com.google.android.gms.maps.model.LatLng r14, final X.C31861d4 r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.WaMapView.A01(X.1ty, com.google.android.gms.maps.model.LatLng, X.1d4):void");
    }

    public void A02(C41471ty c41471ty, C0KC c0kc, boolean z) {
        LatLng latLng;
        C31861d4 c31861d4;
        C0K0 c0k0;
        if (!z && (c0k0 = c0kc.A02) != null) {
            latLng = new LatLng(c0k0.A00, c0k0.A01);
        } else {
            latLng = new LatLng(((C0KD) c0kc).A00, ((C0KD) c0kc).A01);
            if (z) {
                c31861d4 = null;
                A01(c41471ty, latLng, c31861d4);
            }
        }
        c31861d4 = C31861d4.A00(getContext(), R.raw.expired_map_style_json);
        A01(c41471ty, latLng, c31861d4);
    }
}
