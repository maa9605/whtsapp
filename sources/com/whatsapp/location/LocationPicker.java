package com.whatsapp.location;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass012;
import X.C001200o;
import X.C015907l;
import X.C016007m;
import X.C018608r;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02M;
import X.C02O;
import X.C07K;
import X.C08N;
import X.C0C9;
import X.C0HA;
import X.C0IK;
import X.C0L7;
import X.C0LF;
import X.C0SJ;
import X.C0SK;
import X.C0T4;
import X.C18350tb;
import X.C18690uA;
import X.C18750uG;
import X.C21S;
import X.C2H2;
import X.C2K5;
import X.C2MB;
import X.C2MI;
import X.C3Lm;
import X.C40071rX;
import X.C41451tw;
import X.C41461tx;
import X.C41471ty;
import X.C41481tz;
import X.C455822q;
import X.C47682Ce;
import X.C62842ye;
import X.C67153Ek;
import X.InterfaceC002901k;
import X.InterfaceC18440tk;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.util.WhatsAppLibLoader;

/* loaded from: classes2.dex */
public class LocationPicker extends C21S {
    public float A00;
    public float A01;
    public Bundle A02;
    public C0T4 A03;
    public C18690uA A04;
    public C18690uA A05;
    public C18690uA A06;
    public C0SJ A07;
    public C0IK A08;
    public C02L A09;
    public C018608r A0A;
    public C0L7 A0B;
    public C0LF A0C;
    public C02E A0D;
    public AnonymousClass012 A0E;
    public C001200o A0F;
    public C02F A0G;
    public C0C9 A0H;
    public C47682Ce A0I;
    public C2MI A0J;
    public C0HA A0K;
    public C455822q A0L;
    public C41451tw A0M;
    public C2K5 A0N;
    public C2H2 A0O;
    public C41461tx A0P;
    public C41471ty A0Q;
    public C02O A0R;
    public C40071rX A0S;
    public C2MB A0T;
    public InterfaceC002901k A0U;
    public WhatsAppLibLoader A0V;
    public boolean A0W;
    public final InterfaceC18440tk A0X = new InterfaceC18440tk() { // from class: X.3E7
        {
            LocationPicker.this = this;
        }

        @Override // X.InterfaceC18440tk
        public final void ALj(C0T4 c0t4) {
            final LocationPicker locationPicker = LocationPicker.this;
            if (locationPicker.A03 == null) {
                locationPicker.A03 = c0t4;
                if (c0t4 != null) {
                    if (c0t4 != null) {
                        if (locationPicker.A0G.A04() && !locationPicker.A0O.A0s) {
                            locationPicker.A03.A0B(true);
                        }
                        C0T4 c0t42 = locationPicker.A03;
                        C2H2 c2h2 = locationPicker.A0O;
                        c0t42.A07(0, 0, Math.max(c2h2.A00, c2h2.A02));
                        C18460tm c18460tm = locationPicker.A03.A0S;
                        c18460tm.A01 = false;
                        c18460tm.A00();
                        locationPicker.A03.A08 = new InterfaceC18280tT(locationPicker) { // from class: X.3El
                            public final View A00;

                            @Override // X.InterfaceC18280tT
                            public View AAa(C0SJ c0sj) {
                                return null;
                            }

                            {
                                this.A00 = locationPicker.getLayoutInflater().inflate(R.layout.place_map_info_window, (ViewGroup) null, false);
                            }

                            @Override // X.InterfaceC18280tT
                            public View AAc(C0SJ c0sj) {
                                View view = this.A00;
                                TextView textView = (TextView) view.findViewById(R.id.place_name);
                                TextView textView2 = (TextView) view.findViewById(R.id.place_address);
                                Object obj = c0sj.A0L;
                                if (obj instanceof PlaceInfo) {
                                    PlaceInfo placeInfo = (PlaceInfo) obj;
                                    textView.setText(placeInfo.A06);
                                    textView2.setText(placeInfo.A0B);
                                }
                                return view;
                            }
                        };
                        C0T4 c0t43 = locationPicker.A03;
                        c0t43.A0C = new InterfaceC18340ta() { // from class: X.3EA
                            @Override // X.InterfaceC18340ta
                            public final boolean ALl(C0SJ c0sj) {
                                Object obj;
                                LocationPicker locationPicker2 = locationPicker;
                                C2H2 c2h22 = locationPicker2.A0O;
                                if (c2h22.A0s) {
                                    return true;
                                }
                                if (String.valueOf(((C0SK) c0sj).A07) == null) {
                                    return false;
                                }
                                PlaceInfo placeInfo = c2h22.A0f;
                                if (placeInfo != null && (obj = placeInfo.A0D) != null) {
                                    C0SJ c0sj2 = (C0SJ) obj;
                                    c0sj2.A0H(locationPicker2.A05);
                                    c0sj2.A0D();
                                }
                                c0sj.A0H(locationPicker2.A06);
                                locationPicker2.A0O.A0O(c0sj);
                                locationPicker2.A0O.A0B.setVisibility(8);
                                locationPicker2.A0O.A0E.setVisibility(8);
                                if (locationPicker2.A0O.A0n || !locationPicker2.A0G.A04()) {
                                    c0sj.A0E();
                                    return true;
                                }
                                return true;
                            }
                        };
                        c0t43.A0A = new InterfaceC18300tV() { // from class: X.3E8
                            @Override // X.InterfaceC18300tV
                            public final void AL3(C0SJ c0sj) {
                                locationPicker.A0O.A0P(String.valueOf(((C0SK) c0sj).A07), c0sj);
                            }
                        };
                        c0t43.A0B = new InterfaceC18310tW() { // from class: X.3E9
                            @Override // X.InterfaceC18310tW
                            public final void ALh(C016007m c016007m) {
                                LocationPicker locationPicker2 = locationPicker;
                                PlaceInfo placeInfo = locationPicker2.A0O.A0f;
                                if (placeInfo != null) {
                                    Object obj = placeInfo.A0D;
                                    if (obj != null) {
                                        ((C0SJ) obj).A0H(locationPicker2.A05);
                                    }
                                    C2H2 c2h22 = locationPicker2.A0O;
                                    c2h22.A0f = null;
                                    c2h22.A0D();
                                }
                                C2H2 c2h23 = locationPicker2.A0O;
                                if (c2h23.A0n) {
                                    c2h23.A0E.setVisibility(0);
                                }
                                locationPicker2.A0O.A0B.setVisibility(8);
                            }
                        };
                        c0t43.A09 = new InterfaceC18290tU() { // from class: X.3E6
                            @Override // X.InterfaceC18290tU
                            public final void AI8(C015907l c015907l) {
                                C2H2 c2h22 = locationPicker.A0O;
                                C016007m c016007m = c015907l.A03;
                                c2h22.A0E(c016007m.A00, c016007m.A01);
                            }
                        };
                        locationPicker.A0O.A0S(false, null);
                        C2H2 c2h22 = locationPicker.A0O;
                        C2H3 c2h3 = c2h22.A0g;
                        if (c2h3 != null && !c2h3.A08.isEmpty()) {
                            c2h22.A05();
                        }
                        Bundle bundle = locationPicker.A02;
                        if (bundle != null) {
                            locationPicker.A0N.setLocationMode(bundle.getInt("map_location_mode", 2));
                            if (locationPicker.A02.containsKey("camera_zoom")) {
                                locationPicker.A03.A08(C07K.A0i(new C016007m(locationPicker.A02.getDouble("camera_lat"), locationPicker.A02.getDouble("camera_lng")), locationPicker.A02.getFloat("camera_zoom")), 0, null);
                            }
                            locationPicker.A02 = null;
                            return;
                        }
                        SharedPreferences A01 = locationPicker.A0R.A01(C02M.A02);
                        locationPicker.A03.A08(C07K.A0i(new C016007m(A01.getFloat("share_location_lat", 37.389805f), A01.getFloat("share_location_lon", -122.08141f)), A01.getFloat("share_location_zoom", 15.0f) - 0.2f), 0, null);
                        return;
                    }
                    throw null;
                }
            }
        }
    };

    public static void A00(LocationPicker locationPicker, C016007m c016007m) {
        if (locationPicker.A03 != null) {
            C0SJ c0sj = locationPicker.A07;
            if (c0sj == null) {
                C18750uG c18750uG = new C18750uG();
                c18750uG.A02 = c016007m;
                c18750uG.A01 = locationPicker.A04;
                C0T4 c0t4 = locationPicker.A03;
                C0SJ c0sj2 = new C0SJ(c0t4, c18750uG);
                c0t4.A09(c0sj2);
                c0sj2.A0I = c0t4;
                locationPicker.A07 = c0sj2;
                return;
            }
            c0sj.A0I(c016007m);
            C0SJ c0sj3 = locationPicker.A07;
            ((C0SK) c0sj3).A04 = true;
            c0sj3.A01();
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$1899$LocationPicker(View view) {
        Object obj;
        this.A0O.A0B.setVisibility(0);
        PlaceInfo placeInfo = this.A0O.A0f;
        if (placeInfo == null || (obj = placeInfo.A0D) == null) {
            return;
        }
        ((C0SJ) obj).A0D();
    }

    public void lambda$onCreate$1900$LocationPicker(View view) {
        C2H2 c2h2 = this.A0O;
        if (c2h2.A0s) {
            if (c2h2.A06 != null) {
                c2h2.A0S.setImageResource(R.drawable.btn_myl_active);
                C0T4 c0t4 = this.A03;
                if (c0t4 != null) {
                    c0t4.A08(C07K.A0h(new C016007m(this.A0O.A06.getLatitude(), this.A0O.A06.getLongitude())), 1500, null);
                }
                this.A0O.A0r = true;
                return;
            }
            return;
        }
        PlaceInfo placeInfo = c2h2.A0f;
        if (placeInfo != null) {
            Object obj = placeInfo.A0D;
            if (obj != null) {
                ((C0SJ) obj).A0H(this.A05);
            }
            C2H2 c2h22 = this.A0O;
            c2h22.A0f = null;
            c2h22.A0D();
        }
        C2H2 c2h23 = this.A0O;
        boolean z = c2h23.A0n;
        View view2 = c2h23.A0E;
        if (z) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
        C2K5 c2k5 = this.A0N;
        int i = c2k5.A02;
        if (i == 0) {
            c2k5.setLocationMode(1);
        } else if (i == 1) {
            c2k5.setLocationMode(0);
        } else if (i != 2) {
        } else {
            c2k5.setLocationMode(1);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A0O.A0V()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.C21S, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.send_location);
        C67153Ek c67153Ek = new C67153Ek(this, this.A0F, this.A0E, ((ActivityC02290Ap) this).A0I, this.A0L, ((ActivityC02290Ap) this).A0A, this.A0T, ((ActivityC02290Ap) this).A08, this.A09, this.A0U, ((ActivityC02290Ap) this).A0H, ((ActivityC02290Ap) this).A0G, this.A0A, this.A0I, ((ActivityC02270An) this).A00, this.A0Q, this.A0B, this.A0D, this.A0S, ((ActivityC02310Ar) this).A01, this.A0H, new C62842ye(this.A0K, this.A0M), this.A0V, this.A0J, this.A0M, this.A0G, ((ActivityC02290Ap) this).A0F, this.A08, this.A0P, this.A0R, this.A0C);
        this.A0O = c67153Ek;
        c67153Ek.A0M(this, bundle);
        this.A0O.A0D.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 33));
        C41481tz.A02(this);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red);
        this.A05 = C08N.A00(decodeResource);
        this.A06 = C08N.A00(decodeResource2);
        this.A04 = C08N.A00(this.A0O.A05);
        C18350tb c18350tb = new C18350tb();
        c18350tb.A02 = 1;
        c18350tb.A08 = true;
        c18350tb.A04 = false;
        c18350tb.A05 = true;
        c18350tb.A07 = true;
        this.A0N = new C3Lm(this, this, c18350tb);
        View findViewById = findViewById(R.id.map_holder);
        if (findViewById != null) {
            ((ViewGroup) findViewById).addView(this.A0N);
            this.A0N.A0E(bundle);
            this.A02 = bundle;
            if (this.A03 == null) {
                this.A03 = this.A0N.A0L(this.A0X);
            }
            C2H2 c2h2 = this.A0O;
            View findViewById2 = findViewById(R.id.my_location);
            if (findViewById2 != null) {
                c2h2.A0S = (ImageView) findViewById2;
                this.A0O.A0S.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 32));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A01 = this.A0O.A01(i);
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
        if (this.A0N != null) {
            this.A0O.A06();
            if (this.A03 != null) {
                SharedPreferences.Editor edit = this.A0R.A01(C02M.A02).edit();
                C015907l A02 = this.A03.A02();
                C016007m c016007m = A02.A03;
                edit.putFloat("share_location_lat", (float) c016007m.A00);
                edit.putFloat("share_location_lon", (float) c016007m.A01);
                edit.putFloat("share_location_zoom", A02.A02);
                edit.apply();
            }
            super.onDestroy();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.A0N.A04();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0O.A0I(intent);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.A0O.A0W(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        C2K5 c2k5 = this.A0N;
        if (c2k5 != null) {
            SensorManager sensorManager = c2k5.A04;
            if (sensorManager != null) {
                sensorManager.unregisterListener(c2k5.A09);
            }
            C2H2 c2h2 = this.A0O;
            c2h2.A0p = c2h2.A16.A04();
            c2h2.A0x.A06(c2h2);
            super.onPause();
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.A0O.A0s) {
            menu.findItem(0).setVisible(false);
            menu.findItem(1).setVisible(false);
        } else if (!this.A0G.A04()) {
            menu.findItem(0).setVisible(false);
            return true;
        }
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        C0T4 c0t4;
        super.onResume();
        if (this.A0G.A04() != this.A0O.A0p) {
            invalidateOptionsMenu();
            if (this.A0G.A04() && (c0t4 = this.A03) != null && !this.A0O.A0s) {
                c0t4.A0B(true);
            }
        }
        C2K5 c2k5 = this.A0N;
        if (c2k5 != null) {
            c2k5.A0M();
            if (this.A03 == null) {
                this.A03 = this.A0N.A0L(this.A0X);
            }
            this.A0O.A07();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0T4 c0t4 = this.A03;
        if (c0t4 != null) {
            C015907l A02 = c0t4.A02();
            bundle.putFloat("camera_zoom", A02.A02);
            C016007m c016007m = A02.A03;
            bundle.putDouble("camera_lat", c016007m.A00);
            bundle.putDouble("camera_lng", c016007m.A01);
            bundle.putInt("map_location_mode", this.A0N.A02);
        }
        this.A0N.A0G(bundle);
        this.A0O.A0L(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A0O.A0Y.A01();
        return false;
    }
}
