package com.whatsapp.location;

import X.AbstractC005302j;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass012;
import X.AnonymousClass088;
import X.BinderC06190Rw;
import X.C002701i;
import X.C00A;
import X.C010605h;
import X.C018708s;
import X.C02F;
import X.C02L;
import X.C02M;
import X.C02O;
import X.C03320Ff;
import X.C03360Fk;
import X.C05W;
import X.C09Y;
import X.C0C8;
import X.C0DK;
import X.C0IK;
import X.C0K6;
import X.C0L5;
import X.C0L7;
import X.C0LF;
import X.C0S8;
import X.C0SL;
import X.C18E;
import X.C18L;
import X.C18M;
import X.C21U;
import X.C237918d;
import X.C2AR;
import X.C2AX;
import X.C2GV;
import X.C2Gz;
import X.C2H1;
import X.C2IY;
import X.C2Xs;
import X.C31871d5;
import X.C31881d6;
import X.C3LT;
import X.C41461tx;
import X.C41471ty;
import X.C48912Hj;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class GroupChatLiveLocationsActivity2 extends C21U {
    public Bundle A02;
    public MenuItem A03;
    public ImageView A04;
    public C0S8 A06;
    public C0IK A07;
    public C02L A08;
    public C03320Ff A09;
    public C0L7 A0A;
    public C05W A0B;
    public AnonymousClass008 A0C;
    public C018708s A0D;
    public C0L5 A0E;
    public C0LF A0F;
    public AnonymousClass012 A0G;
    public C02F A0H;
    public C0DK A0I;
    public C0C8 A0J;
    public C00A A0K;
    public C03360Fk A0L;
    public C2Xs A0M;
    public C2GV A0N;
    public C41461tx A0O;
    public C2AX A0P;
    public C41471ty A0Q;
    public C010605h A0R;
    public C02O A0S;
    public C2AR A0T;
    public C2IY A0U;
    public volatile boolean A0Y;
    public Set A0W = new HashSet();
    public Map A0V = new HashMap();
    public int A01 = 0;
    public float A00 = -1.0f;
    public volatile boolean A0Z = false;
    public C18E A05 = new C18E() { // from class: X.3ES
        {
            GroupChatLiveLocationsActivity2.this = this;
        }

        @Override // X.C18E
        public void AID() {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = GroupChatLiveLocationsActivity2.this;
            groupChatLiveLocationsActivity2.A0Y = false;
            if (groupChatLiveLocationsActivity2.A06 == null) {
                throw null;
            }
        }

        @Override // X.C18E
        public void AKU() {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = GroupChatLiveLocationsActivity2.this;
            groupChatLiveLocationsActivity2.A0Y = false;
            C0S8 c0s8 = groupChatLiveLocationsActivity2.A06;
            if (c0s8 != null) {
                c0s8.A04();
                C2GV c2gv = groupChatLiveLocationsActivity2.A0N;
                if (c2gv.A0j != null) {
                    c2gv.A0V(Float.valueOf(groupChatLiveLocationsActivity2.A06.A02().A02));
                    return;
                }
                C2H1 c2h1 = c2gv.A0l;
                if (c2h1 != null) {
                    LatLng A00 = c2h1.A00();
                    if (groupChatLiveLocationsActivity2.A06.A00().A01().A04.A00(A00) || groupChatLiveLocationsActivity2.A0N.A0t) {
                        return;
                    }
                    groupChatLiveLocationsActivity2.A0Y = true;
                    groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0V(A00, Math.min(groupChatLiveLocationsActivity2.A00 * 2.0f, 16.0f)), this);
                    return;
                } else if (c2gv.A0u || !groupChatLiveLocationsActivity2.A0Z) {
                    return;
                } else {
                    groupChatLiveLocationsActivity2.A0Z = false;
                    groupChatLiveLocationsActivity2.A1T(true);
                    return;
                }
            }
            throw null;
        }
    };
    public final C18L A0X = new C18L() { // from class: X.3E1
        {
            GroupChatLiveLocationsActivity2.this = this;
        }

        @Override // X.C18L
        public final void ALk(C0S8 c0s8) {
            final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = GroupChatLiveLocationsActivity2.this;
            if (groupChatLiveLocationsActivity2.A06 == null) {
                groupChatLiveLocationsActivity2.A06 = c0s8;
                if (c0s8 != null) {
                    c0s8.A07(0, 0, groupChatLiveLocationsActivity2.A01);
                    groupChatLiveLocationsActivity2.A01 = 0;
                    if (groupChatLiveLocationsActivity2.A06 != null) {
                        C02O c02o = groupChatLiveLocationsActivity2.A0S;
                        String str = C02M.A02;
                        int i = 0;
                        boolean z = c02o.A01(str).getBoolean("live_location_show_traffic", false);
                        groupChatLiveLocationsActivity2.A06.A0K(z);
                        MenuItem menuItem = groupChatLiveLocationsActivity2.A03;
                        if (menuItem != null) {
                            menuItem.setChecked(z);
                        }
                        groupChatLiveLocationsActivity2.A06.A06(groupChatLiveLocationsActivity2.A0S.A01(str).getInt("live_location_map_type", 1));
                        C0S8 c0s82 = groupChatLiveLocationsActivity2.A06;
                        if (c0s82 != null) {
                            try {
                                c0s82.A01.ATA(true);
                                C18N A01 = groupChatLiveLocationsActivity2.A06.A01();
                                if (A01 != null) {
                                    try {
                                        A01.A00.ASr(true);
                                        C18N A012 = groupChatLiveLocationsActivity2.A06.A01();
                                        if (A012 != null) {
                                            try {
                                                A012.A00.AUF(false);
                                                C18N A013 = groupChatLiveLocationsActivity2.A06.A01();
                                                if (A013 != null) {
                                                    try {
                                                        A013.A00.ATP(false);
                                                        groupChatLiveLocationsActivity2.A06.A0C(new C18F() { // from class: X.3ET
                                                            public final View A00;

                                                            @Override // X.C18F
                                                            public View AAb(C0SL c0sl) {
                                                                return null;
                                                            }

                                                            {
                                                                GroupChatLiveLocationsActivity2.this = groupChatLiveLocationsActivity2;
                                                                View inflate = groupChatLiveLocationsActivity2.getLayoutInflater().inflate(R.layout.live_location_map_info_window, (ViewGroup) null, false);
                                                                this.A00 = inflate;
                                                                C0AT.A0W(inflate, 3);
                                                            }

                                                            @Override // X.C18F
                                                            public View AAd(C0SL c0sl) {
                                                                TextEmojiLabel textEmojiLabel;
                                                                C0D7 c0d7;
                                                                C2H1 c2h1 = (C2H1) c0sl.A01();
                                                                if (c2h1 != null) {
                                                                    C0K0 c0k0 = c2h1.A02;
                                                                    View view = this.A00;
                                                                    GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = GroupChatLiveLocationsActivity2.this;
                                                                    C06030Rg c06030Rg = new C06030Rg(view, (int) R.id.name_in_group_tv, groupChatLiveLocationsActivity22.A0D, groupChatLiveLocationsActivity22.A0T);
                                                                    TextView textView = (TextView) view.findViewById(R.id.participant_info);
                                                                    View findViewById = view.findViewById(R.id.info_btn);
                                                                    C02L c02l = groupChatLiveLocationsActivity22.A08;
                                                                    UserJid userJid = c0k0.A06;
                                                                    if (c02l.A0A(userJid)) {
                                                                        int A00 = C02160Ac.A00(groupChatLiveLocationsActivity22, R.color.live_location_bubble_me_text);
                                                                        textEmojiLabel = c06030Rg.A01;
                                                                        textEmojiLabel.setTextColor(A00);
                                                                        c06030Rg.A00();
                                                                        findViewById.setVisibility(8);
                                                                    } else {
                                                                        C011005l A03 = C011005l.A03(groupChatLiveLocationsActivity22.A0N.A0c);
                                                                        if (A03 != null && (c0d7 = (C0D7) groupChatLiveLocationsActivity22.A0J.A01(A03).A01.get(userJid)) != null) {
                                                                            int A032 = C02180Ae.A03(groupChatLiveLocationsActivity22.getResources(), c0d7);
                                                                            textEmojiLabel = c06030Rg.A01;
                                                                            textEmojiLabel.setTextColor(A032);
                                                                        } else {
                                                                            int A002 = C02160Ac.A00(groupChatLiveLocationsActivity22, R.color.live_location_bubble_unknown_text);
                                                                            textEmojiLabel = c06030Rg.A01;
                                                                            textEmojiLabel.setTextColor(A002);
                                                                        }
                                                                        c06030Rg.A03(groupChatLiveLocationsActivity22.A0B.A0A(userJid), null);
                                                                        findViewById.setVisibility(0);
                                                                    }
                                                                    C003301p.A06(textEmojiLabel);
                                                                    String str2 = "";
                                                                    int i2 = c0k0.A03;
                                                                    if (i2 != -1) {
                                                                        StringBuilder A0P = C000200d.A0P("");
                                                                        A0P.append(((ActivityC02310Ar) groupChatLiveLocationsActivity22).A01.A0A(R.plurals.location_accuracy, i2, Integer.valueOf(i2)));
                                                                        str2 = A0P.toString();
                                                                    }
                                                                    if (!TextUtils.isEmpty(str2)) {
                                                                        textView.setText(str2);
                                                                        textView.setVisibility(0);
                                                                        return view;
                                                                    }
                                                                    textView.setVisibility(8);
                                                                    return view;
                                                                }
                                                                throw null;
                                                            }
                                                        });
                                                        groupChatLiveLocationsActivity2.A06.A0H(new C18K() { // from class: X.3E0
                                                            @Override // X.C18K
                                                            public final boolean ALm(C0SL c0sl) {
                                                                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = groupChatLiveLocationsActivity2;
                                                                if (groupChatLiveLocationsActivity22.A06 != null) {
                                                                    C2GV c2gv = groupChatLiveLocationsActivity22.A0N;
                                                                    c2gv.A0u = true;
                                                                    c2gv.A0s = false;
                                                                    c2gv.A0U.setVisibility(c2gv.A0m == null ? 0 : 8);
                                                                    if (!(c0sl.A01() instanceof C2H1)) {
                                                                        groupChatLiveLocationsActivity22.A0N.A0B();
                                                                        return true;
                                                                    }
                                                                    C2H1 c2h1 = (C2H1) c0sl.A01();
                                                                    if (!c0sl.A08()) {
                                                                        c2h1 = groupChatLiveLocationsActivity22.A0N.A07((C0K0) c2h1.A04.get(0));
                                                                        if (c2h1 != null) {
                                                                            c0sl = (C0SL) groupChatLiveLocationsActivity22.A0V.get(c2h1.A03);
                                                                        } else {
                                                                            groupChatLiveLocationsActivity22.A0N.A0B();
                                                                            return true;
                                                                        }
                                                                    }
                                                                    if (c2h1.A00 == 1) {
                                                                        groupChatLiveLocationsActivity22.A0N.A0B();
                                                                        return true;
                                                                    }
                                                                    List list = c2h1.A04;
                                                                    if (list.size() == 1) {
                                                                        groupChatLiveLocationsActivity22.A0N.A0Q(c2h1, true);
                                                                        c0sl.A03();
                                                                        return true;
                                                                    } else if (groupChatLiveLocationsActivity22.A06.A02().A02 >= 16.0f) {
                                                                        groupChatLiveLocationsActivity22.A0N.A0Q(c2h1, true);
                                                                        return true;
                                                                    } else {
                                                                        groupChatLiveLocationsActivity22.A1S(list, true);
                                                                        groupChatLiveLocationsActivity22.A0N.A0j = new C62622yI(list, groupChatLiveLocationsActivity22.A06.A02().A02);
                                                                        return true;
                                                                    }
                                                                }
                                                                throw null;
                                                            }
                                                        });
                                                        groupChatLiveLocationsActivity2.A06.A0E(new C18H() { // from class: X.3Dz
                                                            @Override // X.C18H
                                                            public final void AIC(int i2) {
                                                                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = groupChatLiveLocationsActivity2;
                                                                if (i2 == 1) {
                                                                    if (groupChatLiveLocationsActivity22.A06 != null) {
                                                                        C2GV c2gv = groupChatLiveLocationsActivity22.A0N;
                                                                        c2gv.A0u = true;
                                                                        c2gv.A0s = false;
                                                                        c2gv.A0U.setVisibility(c2gv.A0m != null ? 8 : 0);
                                                                        groupChatLiveLocationsActivity22.A06.A04();
                                                                        groupChatLiveLocationsActivity22.A0N.A0t = true;
                                                                        return;
                                                                    }
                                                                    throw null;
                                                                }
                                                            }
                                                        });
                                                        groupChatLiveLocationsActivity2.A06.A0D(new C18G() { // from class: X.3E3
                                                            @Override // X.C18G
                                                            public final void AIA() {
                                                                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = groupChatLiveLocationsActivity2;
                                                                C0S8 c0s83 = groupChatLiveLocationsActivity22.A06;
                                                                if (c0s83 != null) {
                                                                    CameraPosition A02 = c0s83.A02();
                                                                    if (A02 != null) {
                                                                        int i2 = (int) (groupChatLiveLocationsActivity22.A00 * 5.0f);
                                                                        float f = A02.A02;
                                                                        if (i2 != ((int) (5.0f * f))) {
                                                                            groupChatLiveLocationsActivity22.A00 = f;
                                                                            groupChatLiveLocationsActivity22.A1R();
                                                                        }
                                                                        C2GV c2gv = groupChatLiveLocationsActivity22.A0N;
                                                                        if (c2gv.A0j != null) {
                                                                            c2gv.A0V(null);
                                                                        }
                                                                        C2GV c2gv2 = groupChatLiveLocationsActivity22.A0N;
                                                                        C2H1 c2h1 = c2gv2.A0l;
                                                                        if (c2h1 != null && c2gv2.A0t && groupChatLiveLocationsActivity22.A1V(c2h1.A00())) {
                                                                            groupChatLiveLocationsActivity22.A0N.A0B();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                throw null;
                                                            }
                                                        });
                                                        groupChatLiveLocationsActivity2.A06.A0G(new C18J() { // from class: X.3E4
                                                            @Override // X.C18J
                                                            public final void ALi(LatLng latLng) {
                                                                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = groupChatLiveLocationsActivity2;
                                                                C2GV c2gv = groupChatLiveLocationsActivity22.A0N;
                                                                if (c2gv.A0l != null) {
                                                                    c2gv.A0B();
                                                                    return;
                                                                }
                                                                C2H1 A06 = c2gv.A06(latLng);
                                                                if (A06 == null) {
                                                                    return;
                                                                }
                                                                List list = A06.A04;
                                                                if (list.size() == 1) {
                                                                    groupChatLiveLocationsActivity22.A0N.A0Q(A06, true);
                                                                    ((C0SL) groupChatLiveLocationsActivity22.A0V.get(A06.A03)).A03();
                                                                } else if (groupChatLiveLocationsActivity22.A06.A02().A02 >= 16.0f) {
                                                                    groupChatLiveLocationsActivity22.A0N.A0Q(A06, true);
                                                                } else {
                                                                    groupChatLiveLocationsActivity22.A1S(list, true);
                                                                    groupChatLiveLocationsActivity22.A0N.A0j = new C62622yI(list, groupChatLiveLocationsActivity22.A06.A02().A02);
                                                                }
                                                            }
                                                        });
                                                        groupChatLiveLocationsActivity2.A06.A0F(new C18I() { // from class: X.3E2
                                                            @Override // X.C18I
                                                            public final void AL4(C0SL c0sl) {
                                                                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = groupChatLiveLocationsActivity2;
                                                                C2H1 c2h1 = (C2H1) c0sl.A01();
                                                                if (c2h1 != null) {
                                                                    C02L c02l = groupChatLiveLocationsActivity22.A08;
                                                                    UserJid userJid = c2h1.A02.A06;
                                                                    if (!c02l.A0A(userJid)) {
                                                                        Intent intent = new Intent(groupChatLiveLocationsActivity22, QuickContactActivity.class);
                                                                        groupChatLiveLocationsActivity22.A0M.getLocationOnScreen(new int[2]);
                                                                        LatLng A00 = c0sl.A00();
                                                                        C0S8 c0s83 = groupChatLiveLocationsActivity22.A06;
                                                                        if (c0s83 != null) {
                                                                            Point A002 = c0s83.A00().A00(A00);
                                                                            Rect rect = new Rect();
                                                                            int i2 = A002.x;
                                                                            rect.left = i2;
                                                                            int i3 = A002.y;
                                                                            rect.top = i3;
                                                                            rect.right = i2;
                                                                            rect.bottom = i3;
                                                                            intent.setSourceBounds(rect);
                                                                            intent.putExtra("jid", userJid.getRawString());
                                                                            intent.putExtra("gjid", groupChatLiveLocationsActivity22.A0N.A0c.getRawString());
                                                                            intent.putExtra("show_get_direction", true);
                                                                            C0K0 c0k0 = groupChatLiveLocationsActivity22.A0N.A0m;
                                                                            if (c0k0 != null) {
                                                                                intent.putExtra("location_latitude", c0k0.A00);
                                                                                intent.putExtra("location_longitude", groupChatLiveLocationsActivity22.A0N.A0m.A01);
                                                                            }
                                                                            groupChatLiveLocationsActivity22.startActivity(intent);
                                                                            return;
                                                                        }
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                        });
                                                        groupChatLiveLocationsActivity2.A1R();
                                                        if (groupChatLiveLocationsActivity2.A02 != null) {
                                                            C2GV c2gv = groupChatLiveLocationsActivity2.A0N;
                                                            c2gv.A0U.setVisibility((c2gv.A0u && c2gv.A0m == null) ? 8 : 8);
                                                            groupChatLiveLocationsActivity2.A0M.setLocationMode(groupChatLiveLocationsActivity2.A02.getInt("map_location_mode", 2));
                                                            if (groupChatLiveLocationsActivity2.A02.containsKey("camera_zoom")) {
                                                                groupChatLiveLocationsActivity2.A06.A09(AnonymousClass088.A0V(new LatLng(groupChatLiveLocationsActivity2.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity2.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity2.A02.getFloat("camera_zoom")));
                                                            }
                                                            groupChatLiveLocationsActivity2.A02 = null;
                                                        } else if (groupChatLiveLocationsActivity2.A0W.isEmpty()) {
                                                            SharedPreferences A014 = groupChatLiveLocationsActivity2.A0S.A01(str);
                                                            groupChatLiveLocationsActivity2.A06.A09(AnonymousClass088.A0U(new LatLng(A014.getFloat("live_location_lat", 37.389805f), A014.getFloat("live_location_lng", -122.08141f))));
                                                            C0S8 c0s83 = groupChatLiveLocationsActivity2.A06;
                                                            float f = A014.getFloat("live_location_zoom", 16.0f) - 0.2f;
                                                            try {
                                                                ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = AnonymousClass088.A02;
                                                                C07K.A1Q(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                                                                IObjectWrapper AWZ = iCameraUpdateFactoryDelegate.AWZ(f);
                                                                C07K.A1P(AWZ);
                                                                try {
                                                                    c0s83.A01.AGX(AWZ);
                                                                } catch (RemoteException e) {
                                                                    throw new C09Y(e);
                                                                }
                                                            } catch (RemoteException e2) {
                                                                throw new C09Y(e2);
                                                            }
                                                        } else {
                                                            groupChatLiveLocationsActivity2.A1T(false);
                                                        }
                                                        if (AnonymousClass029.A1K(groupChatLiveLocationsActivity2)) {
                                                            groupChatLiveLocationsActivity2.A06.A0I(C31861d4.A00(groupChatLiveLocationsActivity2, R.raw.night_map_style_json));
                                                            return;
                                                        }
                                                        return;
                                                    } catch (RemoteException e3) {
                                                        throw new C09Y(e3);
                                                    }
                                                }
                                                throw null;
                                            } catch (RemoteException e4) {
                                                throw new C09Y(e4);
                                            }
                                        }
                                        throw null;
                                    } catch (RemoteException e5) {
                                        throw new C09Y(e5);
                                    }
                                }
                                throw null;
                            } catch (RemoteException e6) {
                                throw new C09Y(e6);
                            }
                        }
                        throw null;
                    }
                    throw null;
                }
            }
        }
    };

    public static float A00(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f, float f2) {
        if (f > 0.0f) {
            C0S8 c0s8 = groupChatLiveLocationsActivity2.A06;
            if (c0s8 != null) {
                C31881d6 A01 = c0s8.A00().A01();
                Location location = new Location("");
                LatLng latLng = A01.A02;
                location.setLatitude(latLng.A00);
                location.setLongitude(latLng.A01);
                Location location2 = new Location("");
                LatLng latLng2 = A01.A03;
                location2.setLatitude(latLng2.A00);
                location2.setLongitude(latLng2.A01);
                double distanceTo = location2.distanceTo(location);
                if (distanceTo > 0.0d) {
                    float log = (float) ((Math.log((distanceTo / f) / 30.0d) / Math.log(2.0d)) + groupChatLiveLocationsActivity2.A06.A02().A02);
                    if (log > 16.0f) {
                        return 16.0f;
                    }
                    return log;
                }
                return f2;
            }
            throw null;
        }
        return f2;
    }

    public final C0SL A1P(C2H1 c2h1) {
        LatLng A00 = c2h1.A00();
        Bitmap A04 = this.A0N.A04(c2h1);
        C31871d5 c31871d5 = new C31871d5();
        c31871d5.A07 = AnonymousClass088.A0X(A04);
        c31871d5.A09 = this.A0N.A09(c2h1);
        c31871d5.A02 = 0.5f;
        c31871d5.A03 = 0.87f;
        C0S8 c0s8 = this.A06;
        if (c0s8 != null) {
            c31871d5.A08 = A00;
            C0SL A03 = c0s8.A03(c31871d5);
            this.A0V.put(c2h1.A03, A03);
            return A03;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        if (r4.A0H.A04() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1Q() {
        /*
            r4 = this;
            X.C000700j.A01()
            X.0S8 r0 = r4.A06
            if (r0 != 0) goto L1c
            X.2Xs r3 = r4.A0M
            X.18L r2 = r4.A0X
            r1 = 0
            if (r3 == 0) goto L37
            X.C000700j.A01()
            X.0S8 r0 = r3.A08
            if (r0 == 0) goto L33
            r2.ALk(r0)
            X.0S8 r1 = r3.A08
        L1a:
            r4.A06 = r1
        L1c:
            android.widget.ImageView r2 = r4.A04
            X.2GV r0 = r4.A0N
            X.0K0 r0 = r0.A0m
            if (r0 != 0) goto L2d
            X.02F r0 = r4.A0H
            boolean r1 = r0.A04()
            r0 = 0
            if (r1 != 0) goto L2f
        L2d:
            r0 = 8
        L2f:
            r2.setVisibility(r0)
            return
        L33:
            r3.A06(r2)
            goto L1a
        L37:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A1Q():void");
    }

    public final void A1R() {
        C0S8 c0s8 = this.A06;
        if (c0s8 == null) {
            return;
        }
        C2GV c2gv = this.A0N;
        if (c2gv.A0n == null && c2gv.A0m == null) {
            if (this.A0H.A04()) {
                this.A06.A0J(true);
            }
        } else {
            c0s8.A0J(false);
        }
        int width = this.A0M.getWidth();
        int height = this.A0M.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.A0W);
        this.A0W.clear();
        C18M A00 = this.A06.A00();
        C2GV c2gv2 = this.A0N;
        this.A06.A02();
        c2gv2.A0R(new C2Gz(A00));
        for (C2H1 c2h1 : this.A0N.A1R) {
            C0SL c0sl = (C0SL) this.A0V.get(c2h1.A03);
            LatLng A002 = c2h1.A00();
            if (c0sl == null) {
                c0sl = A1P(c2h1);
            } else {
                Object A01 = c0sl.A01();
                if (!(A01 instanceof C2H1)) {
                    c0sl = A1P(c2h1);
                } else {
                    if (!c0sl.A08()) {
                        c0sl.A07(true);
                    }
                    c0sl.A06(A002);
                    C2H1 c2h12 = (C2H1) A01;
                    if (c2h12.A00 != c2h1.A00 || c2h12.A01 != c2h1.A01) {
                        Bitmap A04 = this.A0N.A04(c2h1);
                        try {
                            c0sl.A00.AU1(this.A0N.A09(c2h1));
                            c0sl.A05(AnonymousClass088.A0X(A04));
                        } catch (RemoteException e) {
                            throw new C09Y(e);
                        }
                    }
                }
            }
            if (c2h1.A00 == 1) {
                c0sl.A04(100.0f);
            } else if (c2h1.A04.size() > 1) {
                c0sl.A04(50.0f);
            } else {
                c0sl.A04(1.0f);
            }
            try {
                c0sl.A00.AXF(new BinderC06190Rw(c2h1));
                if (c2h1.A02 == this.A0N.A0o) {
                    c0sl.A03();
                } else {
                    c0sl.A02();
                }
                this.A0W.add(c0sl);
            } catch (RemoteException e2) {
                throw new C09Y(e2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0SL c0sl2 = (C0SL) it.next();
            if (!this.A0W.contains(c0sl2) && c0sl2.A01() != null && c0sl2.A08()) {
                c0sl2.A07(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1S(java.util.List r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A1S(java.util.List, boolean):void");
    }

    public final void A1T(boolean z) {
        if (this.A06 == null || this.A0N.A0u || this.A0W.isEmpty()) {
            return;
        }
        if (this.A0M.getWidth() > 0 && this.A0M.getHeight() > 0) {
            if (z && this.A0Y) {
                this.A0Z = true;
                return;
            }
            ArrayList arrayList = new ArrayList(this.A0W);
            if (this.A06 != null) {
                if (arrayList.isEmpty()) {
                    return;
                }
                LatLng A05 = this.A0N.A05();
                if (A05 != null) {
                    final double d = A05.A00;
                    final double d2 = A05.A01;
                    Collections.sort(arrayList, new Comparator() { // from class: X.2xs
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            double d3 = d;
                            double d4 = d2;
                            C0SL c0sl = (C0SL) obj;
                            C0SL c0sl2 = (C0SL) obj2;
                            return Double.compare(((c0sl.A00().A01 - d4) * (c0sl.A00().A01 - d4)) + ((c0sl.A00().A00 - d3) * (c0sl.A00().A00 - d3)), ((c0sl2.A00().A01 - d4) * (c0sl2.A00().A01 - d4)) + ((c0sl2.A00().A00 - d3) * (c0sl2.A00().A00 - d3)));
                        }
                    });
                }
                C237918d c237918d = new C237918d();
                C237918d c237918d2 = new C237918d();
                c237918d2.A01(((C0SL) arrayList.get(0)).A00());
                c237918d.A01(((C0SL) arrayList.get(0)).A00());
                int i = 1;
                while (i < arrayList.size()) {
                    C0SL c0sl = (C0SL) arrayList.get(i);
                    c237918d2.A01(c0sl.A00());
                    if (!C2GV.A02(c237918d2.A00())) {
                        break;
                    }
                    c237918d.A01(c0sl.A00());
                    i++;
                }
                if (i == 1) {
                    C2H1 c2h1 = (C2H1) ((C0SL) arrayList.get(0)).A01();
                    if (c2h1 != null) {
                        A1S(c2h1.A04, z);
                        return;
                    }
                    throw null;
                }
                A1U(z, c237918d);
                return;
            }
            throw null;
        }
        this.A0M.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2yE
            {
                GroupChatLiveLocationsActivity2.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = GroupChatLiveLocationsActivity2.this;
                groupChatLiveLocationsActivity2.A0M.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (groupChatLiveLocationsActivity2.A0M.getWidth() <= 0 || groupChatLiveLocationsActivity2.A0M.getHeight() <= 0) {
                    return;
                }
                groupChatLiveLocationsActivity2.A1T(false);
            }
        });
    }

    public final void A1U(boolean z, C237918d c237918d) {
        if (this.A06 != null) {
            LatLngBounds A00 = c237918d.A00();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.group_chat_live_location_map_view_bound_size);
            int i = dimensionPixelSize << 1;
            if (this.A0M.getHeight() <= i || this.A0M.getWidth() <= i) {
                return;
            }
            if (z) {
                if (!this.A0Y) {
                    this.A0Y = true;
                    this.A06.A05();
                    this.A06.A0A(AnonymousClass088.A0W(A00, dimensionPixelSize), this.A05);
                    return;
                }
                return;
            }
            this.A06.A05();
            this.A06.A09(AnonymousClass088.A0W(A00, dimensionPixelSize));
            this.A0M.postDelayed(new RunnableEBaseShape3S0100000_I0_3(this, 27), 500L);
            return;
        }
        throw null;
    }

    public final boolean A1V(LatLng latLng) {
        C0S8 c0s8 = this.A06;
        if (c0s8 != null) {
            C18M A00 = c0s8.A00();
            if (A00.A01().A04.A00(latLng)) {
                return false;
            }
            if (latLng.A00 >= A00.A01().A04.A01.A00) {
                return true;
            }
            Point A002 = A00.A00(A00.A01().A04.A01);
            A002.offset(0, this.A0N.A0A);
            try {
                return !new LatLngBounds(A00.A00.A86(new BinderC06190Rw(A002)), A00.A01().A04.A00).A00(latLng);
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$1932$GroupChatLiveLocationsActivity2(View view) {
        this.A0N.A0B();
        C2Xs c2Xs = this.A0M;
        int i = c2Xs.A03;
        if (i == 0) {
            c2Xs.setLocationMode(1);
        } else if (i == 1) {
            c2Xs.setLocationMode(0);
        } else if (i == 2) {
            c2Xs.setLocationMode(1);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A0N.A0Y(i, i2)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        return true;
    }

    @Override // X.C21U, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0N = new C48912Hj(this, this.A0G, ((ActivityC02290Ap) this).A0A, this.A08, this.A0U, ((ActivityC02270An) this).A00, this.A0E, this.A0Q, this.A0A, this.A0B, this.A0D, ((ActivityC02310Ar) this).A01, this.A0C, this.A0K, this.A09, this.A0H, this.A07, this.A0O, this.A0F, this.A0L, this.A0P, this.A0R);
        A0c().A0L(true);
        setContentView(R.layout.groupchat_live_locations);
        C0DK c0dk = this.A0I;
        AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
        if (A02 != null) {
            A0c().A0H(C002701i.A0g(this.A0D.A08(c0dk.A02(A02), false), this, ((ActivityC02290Ap) this).A0H));
            this.A0N.A0N(this, bundle);
            C0K6.A00(this);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            googleMapOptions.A00 = 1;
            googleMapOptions.A05 = false;
            googleMapOptions.A08 = true;
            googleMapOptions.A06 = true;
            googleMapOptions.A0A = true;
            googleMapOptions.A09 = true;
            this.A0M = new C3LT(this, this, googleMapOptions);
            View findViewById = findViewById(R.id.map_holder);
            if (findViewById != null) {
                ((ViewGroup) findViewById).addView(this.A0M);
                this.A0M.A04(bundle);
                View findViewById2 = findViewById(R.id.my_location);
                if (findViewById2 != null) {
                    ImageView imageView = (ImageView) findViewById2;
                    this.A04 = imageView;
                    imageView.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 31));
                    this.A02 = bundle;
                    A1Q();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A03 = this.A0N.A03(i);
        return A03 != null ? A03 : super.onCreateDialog(i);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        C0S8 c0s8;
        getMenuInflater().inflate(R.menu.map_layers, menu);
        MenuItem findItem = menu.findItem(R.id.map_traffic);
        this.A03 = findItem;
        if (findItem == null || (c0s8 = this.A06) == null) {
            return true;
        }
        try {
            findItem.setChecked(c0s8.A01.AFt());
            return true;
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0M.A00();
        this.A0N.A0C();
        if (this.A06 != null) {
            SharedPreferences.Editor edit = this.A0S.A01(C02M.A02).edit();
            CameraPosition A02 = this.A06.A02();
            LatLng latLng = A02.A03;
            edit.putFloat("live_location_lat", (float) latLng.A00);
            edit.putFloat("live_location_lng", (float) latLng.A01);
            edit.putFloat("live_location_zoom", A02.A02);
            edit.apply();
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.A0M.A01();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A06 == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.map_type_normal) {
            this.A06.A06(1);
            this.A0S.A01(C02M.A02).edit().putInt("live_location_map_type", 1).apply();
            return true;
        } else if (itemId == R.id.map_type_satellite) {
            this.A06.A06(4);
            this.A0S.A01(C02M.A02).edit().putInt("live_location_map_type", 4).apply();
            return true;
        } else if (itemId == R.id.map_type_terrain) {
            this.A06.A06(3);
            this.A0S.A01(C02M.A02).edit().putInt("live_location_map_type", 3).apply();
            return true;
        } else if (itemId != R.id.map_traffic) {
            if (itemId == 16908332) {
                finish();
                return true;
            }
            return false;
        } else {
            C0S8 c0s8 = this.A06;
            if (c0s8 != null) {
                try {
                    boolean z = !c0s8.A01.AFt();
                    this.A06.A0K(z);
                    this.A03.setChecked(z);
                    this.A0S.A01(C02M.A02).edit().putBoolean("live_location_show_traffic", z).apply();
                    return true;
                } catch (RemoteException e) {
                    throw new C09Y(e);
                }
            }
            throw null;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A0M.A02();
        C2Xs c2Xs = this.A0M;
        SensorManager sensorManager = c2Xs.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(c2Xs.A0C);
        }
        this.A0N.A0D();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0M.A03();
        this.A0M.A07();
        this.A0N.A0E();
        A1Q();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0S8 c0s8 = this.A06;
        if (c0s8 != null) {
            CameraPosition A02 = c0s8.A02();
            bundle.putFloat("camera_zoom", A02.A02);
            LatLng latLng = A02.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0M.A03);
        }
        this.A0M.A05(bundle);
        this.A0N.A0O(bundle);
        super.onSaveInstanceState(bundle);
    }
}
