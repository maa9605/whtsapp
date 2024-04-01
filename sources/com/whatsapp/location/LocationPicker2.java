package com.whatsapp.location;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass012;
import X.AnonymousClass088;
import X.C000700j;
import X.C001200o;
import X.C018608r;
import X.C019609c;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02M;
import X.C02O;
import X.C0C9;
import X.C0HA;
import X.C0IK;
import X.C0K6;
import X.C0L7;
import X.C0LF;
import X.C0S8;
import X.C0SL;
import X.C18L;
import X.C21Q;
import X.C2H2;
import X.C2MB;
import X.C2MI;
import X.C2Xs;
import X.C31871d5;
import X.C3LU;
import X.C40071rX;
import X.C41451tw;
import X.C41461tx;
import X.C41471ty;
import X.C455822q;
import X.C47682Ce;
import X.C62552yB;
import X.C62842ye;
import X.C67183En;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.util.WhatsAppLibLoader;

/* loaded from: classes2.dex */
public class LocationPicker2 extends C21Q {
    public Bundle A00;
    public C0S8 A01;
    public C019609c A02;
    public C019609c A03;
    public C019609c A04;
    public C0SL A05;
    public C0IK A06;
    public C02L A07;
    public C018608r A08;
    public C0L7 A09;
    public C0LF A0A;
    public C02E A0B;
    public AnonymousClass012 A0C;
    public C001200o A0D;
    public C02F A0E;
    public C0C9 A0F;
    public C47682Ce A0G;
    public C2MI A0H;
    public C0HA A0I;
    public C455822q A0J;
    public C41451tw A0K;
    public C62552yB A0L;
    public C2Xs A0M;
    public C2H2 A0N;
    public C41461tx A0O;
    public C41471ty A0P;
    public C02O A0Q;
    public C40071rX A0R;
    public C2MB A0S;
    public InterfaceC002901k A0T;
    public WhatsAppLibLoader A0U;
    public final C18L A0V = new C18L() { // from class: X.3EF
        {
            LocationPicker2.this = this;
        }

        @Override // X.C18L
        public final void ALk(C0S8 c0s8) {
            final LocationPicker2 locationPicker2 = LocationPicker2.this;
            if (locationPicker2.A01 == null) {
                locationPicker2.A01 = c0s8;
                if (c0s8 != null) {
                    if (c0s8 != null) {
                        locationPicker2.A0L = new C62552yB(c0s8);
                        c0s8.A0K(false);
                        C0S8 c0s82 = locationPicker2.A01;
                        if (c0s82 != null) {
                            try {
                                c0s82.A01.ATA(true);
                                if (locationPicker2.A0E.A04() && !locationPicker2.A0N.A0s) {
                                    locationPicker2.A01.A0J(true);
                                }
                                C0S8 c0s83 = locationPicker2.A01;
                                C2H2 c2h2 = locationPicker2.A0N;
                                c0s83.A07(0, 0, Math.max(c2h2.A00, c2h2.A02));
                                C18N A01 = locationPicker2.A01.A01();
                                if (A01 != null) {
                                    try {
                                        A01.A00.ATP(false);
                                        locationPicker2.A01.A0C(new C18F(locationPicker2) { // from class: X.3Eo
                                            public final View A00;

                                            @Override // X.C18F
                                            public View AAb(C0SL c0sl) {
                                                return null;
                                            }

                                            {
                                                this.A00 = locationPicker2.getLayoutInflater().inflate(R.layout.place_map_info_window, (ViewGroup) null, false);
                                            }

                                            @Override // X.C18F
                                            public View AAd(C0SL c0sl) {
                                                View view = this.A00;
                                                TextView textView = (TextView) view.findViewById(R.id.place_name);
                                                TextView textView2 = (TextView) view.findViewById(R.id.place_address);
                                                if (c0sl.A01() instanceof PlaceInfo) {
                                                    PlaceInfo placeInfo = (PlaceInfo) c0sl.A01();
                                                    textView.setText(placeInfo.A06);
                                                    textView2.setText(placeInfo.A0B);
                                                }
                                                return view;
                                            }
                                        });
                                        locationPicker2.A01.A0H(new C18K() { // from class: X.3EG
                                            @Override // X.C18K
                                            public final boolean ALm(C0SL c0sl) {
                                                Object obj;
                                                LocationPicker2 locationPicker22 = locationPicker2;
                                                if (locationPicker22.A0N.A0s) {
                                                    return true;
                                                }
                                                if (c0sl != null) {
                                                    try {
                                                        if (c0sl.A00.getId() == null) {
                                                            return false;
                                                        }
                                                        PlaceInfo placeInfo = locationPicker22.A0N.A0f;
                                                        if (placeInfo != null && (obj = placeInfo.A0D) != null) {
                                                            C0SL c0sl2 = (C0SL) obj;
                                                            c0sl2.A05(locationPicker22.A03);
                                                            c0sl2.A02();
                                                        }
                                                        c0sl.A05(locationPicker22.A04);
                                                        locationPicker22.A0N.A0O(c0sl);
                                                        locationPicker22.A0N.A0B.setVisibility(8);
                                                        locationPicker22.A0N.A0E.setVisibility(8);
                                                        if (locationPicker22.A0N.A0n || !locationPicker22.A0E.A04()) {
                                                            c0sl.A03();
                                                            return true;
                                                        }
                                                        return true;
                                                    } catch (RemoteException e) {
                                                        throw new C09Y(e);
                                                    }
                                                }
                                                throw null;
                                            }
                                        });
                                        locationPicker2.A01.A0F(new C18I() { // from class: X.3EC
                                            @Override // X.C18I
                                            public final void AL4(C0SL c0sl) {
                                                C2H2 c2h22 = locationPicker2.A0N;
                                                if (c0sl != null) {
                                                    try {
                                                        c2h22.A0P(c0sl.A00.getId(), c0sl);
                                                        return;
                                                    } catch (RemoteException e) {
                                                        throw new C09Y(e);
                                                    }
                                                }
                                                throw null;
                                            }
                                        });
                                        locationPicker2.A01.A0G(new C18J() { // from class: X.3ED
                                            @Override // X.C18J
                                            public final void ALi(LatLng latLng) {
                                                LocationPicker2 locationPicker22 = locationPicker2;
                                                PlaceInfo placeInfo = locationPicker22.A0N.A0f;
                                                if (placeInfo != null) {
                                                    Object obj = placeInfo.A0D;
                                                    if (obj != null) {
                                                        ((C0SL) obj).A05(locationPicker22.A03);
                                                    }
                                                    C2H2 c2h22 = locationPicker22.A0N;
                                                    c2h22.A0f = null;
                                                    c2h22.A0D();
                                                }
                                                C2H2 c2h23 = locationPicker22.A0N;
                                                if (c2h23.A0n) {
                                                    c2h23.A0E.setVisibility(0);
                                                }
                                                locationPicker22.A0N.A0B.setVisibility(8);
                                            }
                                        });
                                        locationPicker2.A01.A0E(new C18H() { // from class: X.3EE
                                            @Override // X.C18H
                                            public final void AIC(int i) {
                                                LocationPicker2 locationPicker22 = locationPicker2;
                                                if (i == 1) {
                                                    C2H2 c2h22 = locationPicker22.A0N;
                                                    if (c2h22.A0s) {
                                                        c2h22.A0S.setImageResource(R.drawable.btn_myl);
                                                        locationPicker22.A0N.A0r = false;
                                                    } else {
                                                        PlaceInfo placeInfo = c2h22.A0f;
                                                        if (placeInfo != null) {
                                                            Object obj = placeInfo.A0D;
                                                            if (obj != null) {
                                                                C0SL c0sl = (C0SL) obj;
                                                                c0sl.A05(locationPicker22.A03);
                                                                c0sl.A02();
                                                            }
                                                            C2H2 c2h23 = locationPicker22.A0N;
                                                            c2h23.A0f = null;
                                                            c2h23.A0D();
                                                        }
                                                        C2H2 c2h24 = locationPicker22.A0N;
                                                        if (c2h24.A0n) {
                                                            c2h24.A0C.setVisibility(0);
                                                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, locationPicker22.A0N.A0C.getHeight(), 0.0f);
                                                            translateAnimation.setInterpolator(new DecelerateInterpolator());
                                                            translateAnimation.setDuration(120L);
                                                            locationPicker22.A0N.A0D.startAnimation(translateAnimation);
                                                            locationPicker22.A0N.A0E.setVisibility(0);
                                                            locationPicker22.A0N.A0B.setVisibility(8);
                                                        }
                                                    }
                                                }
                                                C2H2 c2h25 = locationPicker22.A0N;
                                                if (c2h25.A0r) {
                                                    c2h25.A0B.setVisibility(8);
                                                }
                                                View findViewById = locationPicker22.findViewById(R.id.map_center_address);
                                                View findViewById2 = locationPicker22.findViewById(R.id.location_description);
                                                if (findViewById != null) {
                                                    findViewById.setVisibility(8);
                                                }
                                                if (findViewById2 != null && locationPicker22.A0N.A0n) {
                                                    findViewById2.setVisibility(8);
                                                }
                                            }
                                        });
                                        locationPicker2.A01.A0D(new C18G() { // from class: X.3EB
                                            @Override // X.C18G
                                            public final void AIA() {
                                                LatLng latLng;
                                                LocationPicker2 locationPicker22 = locationPicker2;
                                                if (locationPicker22.A0N.A0C.getVisibility() == 0) {
                                                    locationPicker22.A0N.A0C.setVisibility(8);
                                                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -locationPicker22.A0N.A0C.getHeight(), 0.0f);
                                                    translateAnimation.setInterpolator(new DecelerateInterpolator());
                                                    translateAnimation.setDuration(120L);
                                                    locationPicker22.A0N.A0D.startAnimation(translateAnimation);
                                                }
                                                C0S8 c0s84 = locationPicker22.A01;
                                                if (c0s84 == null) {
                                                    throw null;
                                                }
                                                CameraPosition A02 = c0s84.A02();
                                                if (A02 != null && (latLng = A02.A03) != null) {
                                                    locationPicker22.A0N.A0E(latLng.A00, latLng.A01);
                                                }
                                            }
                                        });
                                        locationPicker2.A0N.A0S(false, null);
                                        C2H2 c2h22 = locationPicker2.A0N;
                                        C2H3 c2h3 = c2h22.A0g;
                                        if (c2h3 != null && !c2h3.A08.isEmpty()) {
                                            c2h22.A05();
                                        }
                                        Bundle bundle = locationPicker2.A00;
                                        if (bundle != null) {
                                            locationPicker2.A0M.setLocationMode(bundle.getInt("map_location_mode", 2));
                                            if (locationPicker2.A00.containsKey("camera_zoom")) {
                                                locationPicker2.A01.A09(AnonymousClass088.A0V(new LatLng(locationPicker2.A00.getDouble("camera_lat"), locationPicker2.A00.getDouble("camera_lng")), locationPicker2.A00.getFloat("camera_zoom")));
                                            }
                                            locationPicker2.A00 = null;
                                        } else {
                                            SharedPreferences A012 = locationPicker2.A0Q.A01(C02M.A02);
                                            locationPicker2.A01.A09(AnonymousClass088.A0V(new LatLng(A012.getFloat("share_location_lat", 37.389805f), A012.getFloat("share_location_lon", -122.08141f)), A012.getFloat("share_location_zoom", 15.0f) - 0.2f));
                                        }
                                        if (AnonymousClass029.A1K(locationPicker2)) {
                                            locationPicker2.A01.A0I(C31861d4.A00(locationPicker2, R.raw.night_map_style_json));
                                            return;
                                        }
                                        return;
                                    } catch (RemoteException e) {
                                        throw new C09Y(e);
                                    }
                                }
                                throw null;
                            } catch (RemoteException e2) {
                                throw new C09Y(e2);
                            }
                        }
                        throw null;
                    }
                    throw null;
                }
            }
        }
    };

    public static void A00(LocationPicker2 locationPicker2, LatLng latLng) {
        C0S8 c0s8 = locationPicker2.A01;
        if (c0s8 != null) {
            C0SL c0sl = locationPicker2.A05;
            if (c0sl == null) {
                C31871d5 c31871d5 = new C31871d5();
                c31871d5.A08 = latLng;
                c31871d5.A07 = locationPicker2.A02;
                locationPicker2.A05 = c0s8.A03(c31871d5);
                return;
            }
            c0sl.A06(latLng);
            locationPicker2.A05.A07(true);
            return;
        }
        throw null;
    }

    public final void A1P() {
        if (this.A01 == null) {
            C2Xs c2Xs = this.A0M;
            C18L c18l = this.A0V;
            C0S8 c0s8 = null;
            if (c2Xs != null) {
                C000700j.A01();
                C0S8 c0s82 = c2Xs.A08;
                if (c0s82 != null) {
                    c18l.ALk(c0s82);
                    c0s8 = c2Xs.A08;
                } else {
                    c2Xs.A06(c18l);
                }
                this.A01 = c0s8;
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$1907$LocationPicker2(View view) {
        Object obj;
        this.A0N.A0B.setVisibility(0);
        PlaceInfo placeInfo = this.A0N.A0f;
        if (placeInfo == null || (obj = placeInfo.A0D) == null) {
            return;
        }
        ((C0SL) obj).A02();
    }

    public /* synthetic */ void lambda$onCreate$1908$LocationPicker2(View view) {
        C2H2 c2h2 = this.A0N;
        if (c2h2.A0s) {
            if (c2h2.A06 != null) {
                c2h2.A0S.setImageResource(R.drawable.btn_myl_active);
                C0S8 c0s8 = this.A01;
                if (c0s8 != null) {
                    c0s8.A08(AnonymousClass088.A0U(new LatLng(this.A0N.A06.getLatitude(), this.A0N.A06.getLongitude())));
                }
                this.A0N.A0r = true;
                return;
            }
            return;
        }
        PlaceInfo placeInfo = c2h2.A0f;
        if (placeInfo != null) {
            Object obj = placeInfo.A0D;
            if (obj != null) {
                ((C0SL) obj).A05(this.A03);
            }
            C2H2 c2h22 = this.A0N;
            c2h22.A0f = null;
            c2h22.A0D();
        }
        C2H2 c2h23 = this.A0N;
        boolean z = c2h23.A0n;
        View view2 = c2h23.A0E;
        if (z) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
        C2Xs c2Xs = this.A0M;
        int i = c2Xs.A03;
        if (i == 0) {
            c2Xs.setLocationMode(1);
        } else if (i == 1) {
            c2Xs.setLocationMode(0);
        } else if (i != 2) {
        } else {
            c2Xs.setLocationMode(1);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A0N.A0V()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.C21Q, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.send_location);
        C67183En c67183En = new C67183En(this, this.A0D, this.A0C, ((ActivityC02290Ap) this).A0I, this.A0J, ((ActivityC02290Ap) this).A0A, this.A0S, ((ActivityC02290Ap) this).A08, this.A07, this.A0T, ((ActivityC02290Ap) this).A0H, ((ActivityC02290Ap) this).A0G, this.A08, this.A0G, ((ActivityC02270An) this).A00, this.A0P, this.A09, this.A0B, this.A0R, ((ActivityC02310Ar) this).A01, this.A0F, new C62842ye(this.A0I, this.A0K), this.A0U, this.A0H, this.A0K, this.A0E, ((ActivityC02290Ap) this).A0F, this.A06, this.A0O, this.A0Q, this.A0A);
        this.A0N = c67183En;
        c67183En.A0M(this, bundle);
        this.A0N.A0D.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 35));
        C0K6.A00(this);
        this.A03 = AnonymousClass088.A0X(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green));
        this.A04 = AnonymousClass088.A0X(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red));
        this.A02 = AnonymousClass088.A0X(this.A0N.A05);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        googleMapOptions.A0C = Boolean.FALSE;
        googleMapOptions.A05 = false;
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = false;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A0M = new C3LU(this, this, googleMapOptions);
        View findViewById = findViewById(R.id.map_holder);
        if (findViewById != null) {
            ((ViewGroup) findViewById).addView(this.A0M);
            this.A0M.A04(bundle);
            this.A00 = bundle;
            A1P();
            C2H2 c2h2 = this.A0N;
            View findViewById2 = findViewById(R.id.my_location);
            if (findViewById2 != null) {
                c2h2.A0S = (ImageView) findViewById2;
                this.A0N.A0S.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 34));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A01 = this.A0N.A01(i);
        return A01 != null ? A01 : super.onCreateDialog(i);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.search).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        menu.add(0, 1, 0, R.string.refresh).setIcon(R.drawable.ic_action_refresh).setShowAsAction(1);
        return true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A0M.A00();
        this.A0N.A06();
        if (this.A01 != null) {
            SharedPreferences.Editor edit = this.A0Q.A01(C02M.A02).edit();
            CameraPosition A02 = this.A01.A02();
            LatLng latLng = A02.A03;
            edit.putFloat("share_location_lat", (float) latLng.A00);
            edit.putFloat("share_location_lon", (float) latLng.A01);
            edit.putFloat("share_location_zoom", A02.A02);
            edit.apply();
        }
        super.onDestroy();
    }

    @Override // X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.A0M.A01();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0N.A0I(intent);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.A0N.A0W(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        this.A0M.A02();
        C2Xs c2Xs = this.A0M;
        SensorManager sensorManager = c2Xs.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(c2Xs.A0C);
        }
        C2H2 c2h2 = this.A0N;
        c2h2.A0p = c2h2.A16.A04();
        c2h2.A0x.A06(c2h2);
        super.onPause();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.A0N.A0s) {
            menu.findItem(0).setVisible(false);
            menu.findItem(1).setVisible(false);
        } else if (!this.A0E.A04()) {
            menu.findItem(0).setVisible(false);
            return true;
        }
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        C0S8 c0s8;
        super.onResume();
        if (this.A0E.A04() != this.A0N.A0p) {
            invalidateOptionsMenu();
            if (this.A0E.A04() && (c0s8 = this.A01) != null && !this.A0N.A0s) {
                c0s8.A0J(true);
            }
        }
        this.A0M.A03();
        this.A0M.A07();
        A1P();
        this.A0N.A07();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0S8 c0s8 = this.A01;
        if (c0s8 != null) {
            CameraPosition A02 = c0s8.A02();
            bundle.putFloat("camera_zoom", A02.A02);
            LatLng latLng = A02.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0M.A03);
        }
        this.A0M.A05(bundle);
        this.A0N.A0L(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A0N.A0Y.A01();
        return false;
    }
}
