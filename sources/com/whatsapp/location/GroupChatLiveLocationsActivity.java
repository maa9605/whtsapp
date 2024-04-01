package com.whatsapp.location;

import X.AbstractC005302j;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass012;
import X.C002701i;
import X.C00A;
import X.C010605h;
import X.C015807k;
import X.C015907l;
import X.C016007m;
import X.C018708s;
import X.C02F;
import X.C02L;
import X.C02M;
import X.C02O;
import X.C03320Ff;
import X.C03360Fk;
import X.C05W;
import X.C07K;
import X.C08N;
import X.C0C8;
import X.C0DK;
import X.C0IK;
import X.C0K0;
import X.C0L5;
import X.C0L7;
import X.C0LF;
import X.C0SJ;
import X.C0SK;
import X.C0T4;
import X.C18350tb;
import X.C18450tl;
import X.C18730uE;
import X.C18740uF;
import X.C18750uG;
import X.C18800uL;
import X.C21W;
import X.C2AR;
import X.C2AX;
import X.C2GV;
import X.C2Gz;
import X.C2H1;
import X.C2IY;
import X.C2K5;
import X.C3Ll;
import X.C41461tx;
import X.C41471ty;
import X.C41481tz;
import X.C48922Hk;
import X.InterfaceC18270tS;
import X.InterfaceC18440tk;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
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
public class GroupChatLiveLocationsActivity extends C21W {
    public Bundle A02;
    public ImageView A03;
    public C0T4 A05;
    public C0IK A06;
    public C02L A07;
    public C03320Ff A08;
    public C0L7 A09;
    public C05W A0A;
    public AnonymousClass008 A0B;
    public C018708s A0C;
    public C0L5 A0D;
    public C0LF A0E;
    public AnonymousClass012 A0F;
    public C02F A0G;
    public C0DK A0H;
    public C0C8 A0I;
    public C00A A0J;
    public C03360Fk A0K;
    public C2K5 A0L;
    public C2GV A0M;
    public C41461tx A0N;
    public C2AX A0O;
    public C41471ty A0P;
    public C010605h A0Q;
    public C02O A0R;
    public C2AR A0S;
    public C2IY A0T;
    public volatile boolean A0X;
    public Set A0V = new HashSet();
    public Map A0U = new HashMap();
    public int A01 = 0;
    public final InterfaceC18440tk A0W = new InterfaceC18440tk() { // from class: X.3Du
        {
            GroupChatLiveLocationsActivity.this = this;
        }

        @Override // X.InterfaceC18440tk
        public final void ALj(C0T4 c0t4) {
            final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = GroupChatLiveLocationsActivity.this;
            if (groupChatLiveLocationsActivity.A05 == null) {
                groupChatLiveLocationsActivity.A05 = c0t4;
                if (c0t4 != null) {
                    c0t4.A07(0, 0, groupChatLiveLocationsActivity.A01);
                    groupChatLiveLocationsActivity.A01 = 0;
                    C0T4 c0t42 = groupChatLiveLocationsActivity.A05;
                    if (c0t42 != null) {
                        c0t42.A0S.A01(true);
                        C18460tm c18460tm = groupChatLiveLocationsActivity.A05.A0S;
                        c18460tm.A01 = false;
                        c18460tm.A00();
                        groupChatLiveLocationsActivity.A05.A08 = new InterfaceC18280tT() { // from class: X.3ER
                            public final View A00;

                            @Override // X.InterfaceC18280tT
                            public View AAa(C0SJ c0sj) {
                                return null;
                            }

                            {
                                GroupChatLiveLocationsActivity.this = groupChatLiveLocationsActivity;
                                View inflate = groupChatLiveLocationsActivity.getLayoutInflater().inflate(R.layout.live_location_map_info_window, (ViewGroup) null, false);
                                this.A00 = inflate;
                                C0AT.A0W(inflate, 3);
                            }

                            @Override // X.InterfaceC18280tT
                            public View AAc(C0SJ c0sj) {
                                TextEmojiLabel textEmojiLabel;
                                C0D7 c0d7;
                                C0K0 c0k0 = ((C2H1) c0sj.A0L).A02;
                                View view = this.A00;
                                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity2 = GroupChatLiveLocationsActivity.this;
                                C06030Rg c06030Rg = new C06030Rg(view, (int) R.id.name_in_group_tv, groupChatLiveLocationsActivity2.A0C, groupChatLiveLocationsActivity2.A0S);
                                TextView textView = (TextView) view.findViewById(R.id.participant_info);
                                View findViewById = view.findViewById(R.id.info_btn);
                                C02L c02l = groupChatLiveLocationsActivity2.A07;
                                UserJid userJid = c0k0.A06;
                                if (c02l.A0A(userJid)) {
                                    int A00 = C02160Ac.A00(groupChatLiveLocationsActivity2, R.color.live_location_bubble_me_text);
                                    textEmojiLabel = c06030Rg.A01;
                                    textEmojiLabel.setTextColor(A00);
                                    c06030Rg.A00();
                                    findViewById.setVisibility(8);
                                } else {
                                    C011005l A03 = C011005l.A03(groupChatLiveLocationsActivity2.A0M.A0c);
                                    if (A03 != null && (c0d7 = (C0D7) groupChatLiveLocationsActivity2.A0I.A01(A03).A01.get(userJid)) != null) {
                                        int A032 = C02180Ae.A03(groupChatLiveLocationsActivity2.getResources(), c0d7);
                                        textEmojiLabel = c06030Rg.A01;
                                        textEmojiLabel.setTextColor(A032);
                                    } else {
                                        int A002 = C02160Ac.A00(groupChatLiveLocationsActivity2, R.color.live_location_bubble_unknown_text);
                                        textEmojiLabel = c06030Rg.A01;
                                        textEmojiLabel.setTextColor(A002);
                                    }
                                    c06030Rg.A03(groupChatLiveLocationsActivity2.A0A.A0A(userJid), null);
                                    findViewById.setVisibility(0);
                                }
                                C003301p.A06(textEmojiLabel);
                                String str = "";
                                int i = c0k0.A03;
                                if (i != -1) {
                                    StringBuilder A0P = C000200d.A0P("");
                                    A0P.append(((ActivityC02310Ar) groupChatLiveLocationsActivity2).A01.A0A(R.plurals.location_accuracy, i, Integer.valueOf(i)));
                                    str = A0P.toString();
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    textView.setText(str);
                                    textView.setVisibility(0);
                                    return view;
                                }
                                textView.setVisibility(8);
                                return view;
                            }
                        };
                        C0T4 c0t43 = groupChatLiveLocationsActivity.A05;
                        c0t43.A0C = new InterfaceC18340ta() { // from class: X.3Dx
                            @Override // X.InterfaceC18340ta
                            public final boolean ALl(C0SJ c0sj) {
                                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity2 = groupChatLiveLocationsActivity;
                                C2GV c2gv = groupChatLiveLocationsActivity2.A0M;
                                c2gv.A0u = true;
                                c2gv.A0s = false;
                                c2gv.A0U.setVisibility(c2gv.A0m == null ? 0 : 8);
                                Object obj = c0sj.A0L;
                                if (!(obj instanceof C2H1)) {
                                    groupChatLiveLocationsActivity2.A0M.A0B();
                                    return true;
                                }
                                C2H1 c2h1 = (C2H1) obj;
                                if (!((C0SK) c0sj).A04) {
                                    c2h1 = groupChatLiveLocationsActivity2.A0M.A07((C0K0) c2h1.A04.get(0));
                                    if (c2h1 != null) {
                                        c0sj = (C0SJ) groupChatLiveLocationsActivity2.A0U.get(c2h1.A03);
                                    } else {
                                        groupChatLiveLocationsActivity2.A0M.A0B();
                                        return true;
                                    }
                                }
                                if (c2h1.A00 == 1) {
                                    groupChatLiveLocationsActivity2.A0M.A0B();
                                    return true;
                                }
                                List list = c2h1.A04;
                                if (list.size() == 1) {
                                    groupChatLiveLocationsActivity2.A0M.A0Q(c2h1, true);
                                    c0sj.A0E();
                                    return true;
                                }
                                C0T4 c0t44 = groupChatLiveLocationsActivity2.A05;
                                if (c0t44 != null) {
                                    if (c0t44.A02().A02 >= 16.0f) {
                                        groupChatLiveLocationsActivity2.A0M.A0Q(c2h1, true);
                                        return true;
                                    }
                                    groupChatLiveLocationsActivity2.A1S(list, true);
                                    groupChatLiveLocationsActivity2.A0M.A0j = new C62622yI(list, groupChatLiveLocationsActivity2.A05.A02().A02);
                                    return true;
                                }
                                throw null;
                            }
                        };
                        c0t43.A09 = new InterfaceC18290tU() { // from class: X.3Dw
                            @Override // X.InterfaceC18290tU
                            public final void AI8(C015907l c015907l) {
                                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity2 = groupChatLiveLocationsActivity;
                                C0T4 c0t44 = groupChatLiveLocationsActivity2.A05;
                                if (c0t44 != null) {
                                    if (((int) (groupChatLiveLocationsActivity2.A00 * 5.0f)) != ((int) (c0t44.A02().A02 * 5.0f))) {
                                        groupChatLiveLocationsActivity2.A00 = groupChatLiveLocationsActivity2.A05.A02().A02;
                                        groupChatLiveLocationsActivity2.A1R();
                                        return;
                                    }
                                    return;
                                }
                                throw null;
                            }
                        };
                        c0t43.A0B = new InterfaceC18310tW() { // from class: X.3Dy
                            @Override // X.InterfaceC18310tW
                            public final void ALh(C016007m c016007m) {
                                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity2 = groupChatLiveLocationsActivity;
                                C2GV c2gv = groupChatLiveLocationsActivity2.A0M;
                                if (c2gv.A0l != null) {
                                    c2gv.A0B();
                                    return;
                                }
                                C2H1 A06 = c2gv.A06(new LatLng(c016007m.A00, c016007m.A01));
                                if (A06 == null) {
                                    return;
                                }
                                List list = A06.A04;
                                if (list.size() == 1) {
                                    groupChatLiveLocationsActivity2.A0M.A0Q(A06, true);
                                    ((C0SJ) groupChatLiveLocationsActivity2.A0U.get(A06.A03)).A0E();
                                } else if (groupChatLiveLocationsActivity2.A05.A02().A02 >= 16.0f) {
                                    groupChatLiveLocationsActivity2.A0M.A0Q(A06, true);
                                } else {
                                    groupChatLiveLocationsActivity2.A1S(list, true);
                                    groupChatLiveLocationsActivity2.A0M.A0j = new C62622yI(list, groupChatLiveLocationsActivity2.A05.A02().A02);
                                }
                            }
                        };
                        c0t43.A0A = new InterfaceC18300tV() { // from class: X.3Dv
                            @Override // X.InterfaceC18300tV
                            public final void AL3(C0SJ c0sj) {
                                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity2 = groupChatLiveLocationsActivity;
                                C2H1 c2h1 = (C2H1) c0sj.A0L;
                                if (c2h1 != null && !groupChatLiveLocationsActivity2.A07.A0A(c2h1.A02.A06)) {
                                    Intent intent = new Intent(groupChatLiveLocationsActivity2, QuickContactActivity.class);
                                    C016007m A0C = c0sj.A0C();
                                    C0T4 c0t44 = groupChatLiveLocationsActivity2.A05;
                                    if (c0t44 != null) {
                                        Point A04 = c0t44.A0R.A04(A0C);
                                        Rect rect = new Rect();
                                        int i = A04.x;
                                        rect.left = i;
                                        int i2 = A04.y;
                                        rect.top = i2;
                                        rect.right = i;
                                        rect.bottom = i2;
                                        intent.setSourceBounds(rect);
                                        intent.putExtra("jid", c2h1.A02.A06.getRawString());
                                        intent.putExtra("gjid", groupChatLiveLocationsActivity2.A0M.A0c.getRawString());
                                        intent.putExtra("show_get_direction", true);
                                        C0K0 c0k0 = groupChatLiveLocationsActivity2.A0M.A0m;
                                        if (c0k0 != null) {
                                            intent.putExtra("location_latitude", c0k0.A00);
                                            intent.putExtra("location_longitude", groupChatLiveLocationsActivity2.A0M.A0m.A01);
                                        }
                                        groupChatLiveLocationsActivity2.startActivity(intent);
                                        return;
                                    }
                                    throw null;
                                }
                            }
                        };
                        groupChatLiveLocationsActivity.A1R();
                        Bundle bundle = groupChatLiveLocationsActivity.A02;
                        if (bundle != null) {
                            groupChatLiveLocationsActivity.A0L.setLocationMode(bundle.getInt("map_location_mode", 2));
                            if (groupChatLiveLocationsActivity.A02.containsKey("camera_zoom")) {
                                groupChatLiveLocationsActivity.A05.A08(C07K.A0i(new C016007m(groupChatLiveLocationsActivity.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity.A02.getFloat("camera_zoom")), 0, null);
                            }
                            groupChatLiveLocationsActivity.A02 = null;
                            return;
                        } else if (groupChatLiveLocationsActivity.A0V.isEmpty()) {
                            SharedPreferences A01 = groupChatLiveLocationsActivity.A0R.A01(C02M.A02);
                            groupChatLiveLocationsActivity.A05.A08(C07K.A0h(new C016007m(A01.getFloat("live_location_lat", 37.389805f), A01.getFloat("live_location_lng", -122.08141f))), 0, null);
                            C0T4 c0t44 = groupChatLiveLocationsActivity.A05;
                            C015807k c015807k = new C015807k();
                            c015807k.A03 = A01.getFloat("live_location_zoom", 16.0f) - 0.2f;
                            c0t44.A08(c015807k, 0, null);
                            return;
                        } else {
                            groupChatLiveLocationsActivity.A1T(false);
                            return;
                        }
                    }
                    throw null;
                }
            }
        }
    };
    public float A00 = -1.0f;
    public volatile boolean A0Y = false;
    public InterfaceC18270tS A04 = new InterfaceC18270tS() { // from class: X.3EQ
        {
            GroupChatLiveLocationsActivity.this = this;
        }

        @Override // X.InterfaceC18270tS
        public void AID() {
            GroupChatLiveLocationsActivity.this.A0X = false;
        }

        @Override // X.InterfaceC18270tS
        public void AKU() {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = GroupChatLiveLocationsActivity.this;
            groupChatLiveLocationsActivity.A0X = false;
            C0T4 c0t4 = groupChatLiveLocationsActivity.A05;
            if (c0t4 != null) {
                C2GV c2gv = groupChatLiveLocationsActivity.A0M;
                C0K0 c0k0 = c2gv.A0o;
                if (c0k0 != null) {
                    C016007m c016007m = new C016007m(c0k0.A00, c0k0.A01);
                    Point A04 = c0t4.A0R.A04(c016007m);
                    int i = A04.x;
                    if (i <= 0 || A04.y <= 0 || i >= groupChatLiveLocationsActivity.A0L.getWidth() || A04.y >= groupChatLiveLocationsActivity.A0L.getHeight()) {
                        groupChatLiveLocationsActivity.A0X = true;
                        groupChatLiveLocationsActivity.A05.A08(C07K.A0i(c016007m, groupChatLiveLocationsActivity.A00 * 2.0f), 1500, this);
                        return;
                    }
                    return;
                } else if (c2gv.A0u || !groupChatLiveLocationsActivity.A0Y) {
                    return;
                } else {
                    groupChatLiveLocationsActivity.A0Y = false;
                    groupChatLiveLocationsActivity.A1T(true);
                    return;
                }
            }
            throw null;
        }
    };

    public static float A00(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, float f, float f2) {
        if (f > 0.0f) {
            C0T4 c0t4 = groupChatLiveLocationsActivity.A05;
            if (c0t4 != null) {
                C18800uL A06 = c0t4.A0R.A06();
                Location location = new Location("");
                C016007m c016007m = A06.A02;
                location.setLatitude(c016007m.A00);
                location.setLongitude(c016007m.A01);
                Location location2 = new Location("");
                C016007m c016007m2 = A06.A03;
                location2.setLatitude(c016007m2.A00);
                location2.setLongitude(c016007m2.A01);
                double distanceTo = location2.distanceTo(location);
                if (distanceTo > 0.0d) {
                    float log = (float) ((Math.log((distanceTo / f) / 30.0d) / Math.log(2.0d)) + groupChatLiveLocationsActivity.A05.A02().A02);
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

    public final C0SJ A1P(C2H1 c2h1) {
        if (this.A05 != null) {
            LatLng A00 = c2h1.A00();
            C016007m c016007m = new C016007m(A00.A00, A00.A01);
            Bitmap A04 = this.A0M.A04(c2h1);
            C18750uG c18750uG = new C18750uG();
            c18750uG.A01 = C08N.A00(A04);
            c18750uG.A04 = this.A0M.A09(c2h1);
            float[] fArr = c18750uG.A06;
            fArr[0] = 0.5f;
            fArr[1] = 0.87f;
            C02L c02l = this.A07;
            UserJid userJid = c2h1.A02.A06;
            if (c02l.A0A(userJid)) {
                c18750uG.A04 = getString(R.string.group_subject_changed_by_you);
            } else {
                c18750uG.A04 = this.A0C.A08(this.A0A.A0A(userJid), false);
            }
            C0T4 c0t4 = this.A05;
            c18750uG.A02 = c016007m;
            C0SJ c0sj = new C0SJ(c0t4, c18750uG);
            c0t4.A09(c0sj);
            c0sj.A0I = c0t4;
            this.A0U.put(c2h1.A03, c0sj);
            return c0sj;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0020, code lost:
        if (r3.A0G.A04() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1Q() {
        /*
            r3 = this;
            X.C000700j.A01()
            X.0T4 r0 = r3.A05
            if (r0 != 0) goto L11
            X.2K5 r1 = r3.A0L
            X.0tk r0 = r3.A0W
            X.0T4 r0 = r1.A0L(r0)
            r3.A05 = r0
        L11:
            android.widget.ImageView r2 = r3.A03
            X.2GV r0 = r3.A0M
            X.0K0 r0 = r0.A0m
            if (r0 != 0) goto L22
            X.02F r0 = r3.A0G
            boolean r1 = r0.A04()
            r0 = 0
            if (r1 != 0) goto L24
        L22:
            r0 = 8
        L24:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A1Q():void");
    }

    public final void A1R() {
        int i;
        int i2;
        C0T4 c0t4 = this.A05;
        if (c0t4 == null) {
            return;
        }
        C2GV c2gv = this.A0M;
        if (c2gv.A0n == null && c2gv.A0m == null) {
            if (this.A0G.A04()) {
                this.A05.A0B(true);
            }
        } else {
            c0t4.A0B(false);
        }
        int width = this.A0L.getWidth();
        int height = this.A0L.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.A0V);
        this.A0V.clear();
        C0T4 c0t42 = this.A05;
        C18450tl c18450tl = c0t42.A0R;
        C2GV c2gv2 = this.A0M;
        c0t42.A02();
        c2gv2.A0R(new C2Gz(c18450tl));
        for (C2H1 c2h1 : this.A0M.A1R) {
            C0SJ c0sj = (C0SJ) this.A0U.get(c2h1.A03);
            LatLng A00 = c2h1.A00();
            C016007m c016007m = new C016007m(A00.A00, A00.A01);
            if (c0sj == null) {
                c0sj = A1P(c2h1);
            } else {
                Object obj = c0sj.A0L;
                if (!(obj instanceof C2H1)) {
                    c0sj = A1P(c2h1);
                } else {
                    if (!((C0SK) c0sj).A04) {
                        ((C0SK) c0sj).A04 = true;
                        c0sj.A01();
                    }
                    c0sj.A0I(c016007m);
                    C2H1 c2h12 = (C2H1) obj;
                    if (c2h12.A00 != c2h1.A00 || c2h12.A01 != c2h1.A01) {
                        c0sj.A0H(C08N.A00(this.A0M.A04(c2h1)));
                        c0sj.A0N = this.A0M.A09(c2h1);
                        c0sj.A0F();
                    }
                }
            }
            if (c2h1.A00 == 1) {
                C0T4 c0t43 = ((C0SK) c0sj).A0A;
                c0t43.A0A(c0sj);
                ((C0SK) c0sj).A02 = 100.0f;
                c0t43.A09(c0sj);
            } else if (c2h1.A04.size() > 1) {
                C0T4 c0t44 = ((C0SK) c0sj).A0A;
                c0t44.A0A(c0sj);
                ((C0SK) c0sj).A02 = 50.0f;
                c0t44.A09(c0sj);
            } else {
                C0T4 c0t45 = ((C0SK) c0sj).A0A;
                c0t45.A0A(c0sj);
                ((C0SK) c0sj).A02 = 1.0f;
                c0t45.A09(c0sj);
            }
            c0sj.A0L = c2h1;
            Point A04 = c18450tl.A04(c016007m);
            C0K0 c0k0 = c2h1.A02;
            C0K0 c0k02 = this.A0M.A0o;
            if (c0k0 == c0k02 || (c0k02 == null && c0sj.A0Q && (i = A04.x) >= 0 && i <= this.A0L.getWidth() && (i2 = A04.y) >= 0 && i2 <= this.A0L.getHeight())) {
                c0sj.A0E();
            } else {
                c0sj.A0D();
            }
            this.A0V.add(c0sj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0SJ c0sj2 = (C0SJ) it.next();
            if (!this.A0V.contains(c0sj2) && c0sj2.A0L != null && ((C0SK) c0sj2).A04) {
                ((C0SK) c0sj2).A04 = false;
                c0sj2.A01();
            }
        }
    }

    public final void A1S(List list, boolean z) {
        if (this.A05 != null) {
            if (list.size() == 1) {
                if (z) {
                    this.A0X = true;
                    this.A05.A08(C07K.A0i(new C016007m(((C0K0) list.get(0)).A00, ((C0K0) list.get(0)).A01), 16.0f), 1500, null);
                    return;
                }
                this.A05.A08(C07K.A0i(new C016007m(((C0K0) list.get(0)).A00, ((C0K0) list.get(0)).A01), 16.0f), 0, null);
                return;
            }
            C18730uE c18730uE = new C18730uE();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0K0 c0k0 = (C0K0) it.next();
                double d = c0k0.A00;
                double d2 = c0k0.A01;
                if (!c18730uE.A04) {
                    c18730uE.A02 = d;
                    c18730uE.A01 = d;
                    c18730uE.A00 = d2;
                    c18730uE.A03 = d2;
                    c18730uE.A04 = true;
                }
                if (d > c18730uE.A01) {
                    c18730uE.A01 = d;
                } else if (d < c18730uE.A02) {
                    c18730uE.A02 = d;
                }
                double d3 = c18730uE.A00;
                double d4 = c18730uE.A03;
                double A00 = C18740uF.A00(d3, d4);
                double A002 = C18740uF.A00(d2, d4);
                double A003 = C18740uF.A00(d3, d2);
                if (Double.compare(A002, A00) > 0 || Double.compare(A003, A00) > 0) {
                    if (A002 <= A003) {
                        c18730uE.A00 = d2;
                    } else {
                        c18730uE.A03 = d2;
                    }
                }
            }
            A1U(z, c18730uE);
            return;
        }
        throw null;
    }

    public final void A1T(boolean z) {
        if (this.A05 == null || this.A0M.A0u || this.A0V.isEmpty()) {
            return;
        }
        if (this.A0L.getWidth() > 0 && this.A0L.getHeight() > 0) {
            if (z && this.A0X) {
                this.A0Y = true;
                return;
            }
            ArrayList arrayList = new ArrayList(this.A0V);
            if (this.A05 != null) {
                if (this.A0M.A05() != null) {
                    LatLng A05 = this.A0M.A05();
                    C016007m c016007m = new C016007m(A05.A00, A05.A01);
                    final double d = c016007m.A00;
                    final double d2 = c016007m.A01;
                    Collections.sort(arrayList, new Comparator() { // from class: X.2xr
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            double d3 = d;
                            double d4 = d2;
                            C016007m A0C = ((C0SJ) obj).A0C();
                            double d5 = A0C.A00 - d3;
                            double d6 = A0C.A01 - d4;
                            double d7 = (d6 * d6) + (d5 * d5);
                            C016007m A0C2 = ((C0SJ) obj2).A0C();
                            double d8 = A0C2.A00 - d3;
                            double d9 = A0C2.A01 - d4;
                            return Double.compare(d7, (d9 * d9) + (d8 * d8));
                        }
                    });
                }
                C18730uE c18730uE = new C18730uE();
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                double d6 = 0.0d;
                int i = 0;
                boolean z2 = false;
                while (i < arrayList.size()) {
                    C0SJ c0sj = (C0SJ) arrayList.get(i);
                    C016007m A0C = c0sj.A0C();
                    if (!z2) {
                        d3 = A0C.A00;
                        d5 = A0C.A01;
                        d4 = d3;
                        d6 = d5;
                        z2 = true;
                    }
                    double d7 = A0C.A00;
                    if (d7 > d3) {
                        d3 = d7;
                    } else if (d7 < d4) {
                        d4 = d7;
                    }
                    double A00 = C18740uF.A00(d5, d6);
                    double d8 = A0C.A01;
                    double A002 = C18740uF.A00(d8, d6);
                    double A003 = C18740uF.A00(d5, d8);
                    if (Double.compare(A002, A00) > 0 || Double.compare(A003, A00) > 0) {
                        if (A002 <= A003) {
                            d5 = A0C.A01;
                        } else {
                            d6 = A0C.A01;
                        }
                    }
                    C18740uF c18740uF = new C18740uF(new C016007m(d4, d6), new C016007m(d3, d5));
                    C016007m c016007m2 = c18740uF.A01;
                    LatLng latLng = new LatLng(c016007m2.A00, c016007m2.A01);
                    C016007m c016007m3 = c18740uF.A00;
                    if (!C2GV.A02(new LatLngBounds(latLng, new LatLng(c016007m3.A00, c016007m3.A01)))) {
                        break;
                    }
                    c18730uE.A00(c0sj.A0C());
                    i++;
                }
                if (i == 1) {
                    A1S(((C2H1) ((C0SJ) arrayList.get(0)).A0L).A04, z);
                    return;
                } else {
                    A1U(z, c18730uE);
                    return;
                }
            }
            throw null;
        }
        this.A0L.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2yD
            {
                GroupChatLiveLocationsActivity.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = GroupChatLiveLocationsActivity.this;
                groupChatLiveLocationsActivity.A0L.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (groupChatLiveLocationsActivity.A0L.getWidth() <= 0 || groupChatLiveLocationsActivity.A0L.getHeight() <= 0) {
                    return;
                }
                groupChatLiveLocationsActivity.A1T(false);
            }
        });
    }

    public final void A1U(boolean z, C18730uE c18730uE) {
        if (this.A05 != null) {
            C18740uF c18740uF = new C18740uF(new C016007m(c18730uE.A02, c18730uE.A03), new C016007m(c18730uE.A01, c18730uE.A00));
            C016007m A01 = c18740uF.A01();
            int width = this.A0L.getWidth();
            int height = this.A0L.getHeight();
            C016007m c016007m = c18740uF.A01;
            LatLng latLng = new LatLng(c016007m.A00, c016007m.A01);
            C016007m c016007m2 = c18740uF.A00;
            LatLngBounds latLngBounds = new LatLngBounds(latLng, new LatLng(c016007m2.A00, c016007m2.A01));
            LatLng latLng2 = latLngBounds.A00;
            double A00 = C2GV.A00(latLng2.A00);
            LatLng latLng3 = latLngBounds.A01;
            double A002 = (A00 - C2GV.A00(latLng3.A00)) / 3.141592653589793d;
            double d = latLng2.A01 - latLng3.A01;
            if (d < 0.0d) {
                d += 360.0d;
            }
            float min = (float) Math.min(Math.log((height / 256.0d) / A002) / 0.6931471805599453d, Math.log((width / 256.0d) / (d / 360.0d)) / 0.6931471805599453d);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.group_chat_live_location_map_view_bound_size);
            int i = dimensionPixelSize << 1;
            if (this.A0L.getHeight() <= i || this.A0L.getWidth() <= i) {
                return;
            }
            if (z) {
                this.A0X = true;
                if (min > 21.0f) {
                    this.A05.A08(C07K.A0i(A01, 19.0f), 1500, this.A04);
                    return;
                }
                C0T4 c0t4 = this.A05;
                C015807k c015807k = new C015807k();
                c015807k.A09 = c18740uF;
                c015807k.A07 = dimensionPixelSize;
                c0t4.A08(c015807k, 1500, this.A04);
                return;
            }
            this.A05.A08(C07K.A0i(A01, Math.min(19.0f, min)), 0, null);
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$1925$GroupChatLiveLocationsActivity(View view) {
        this.A0M.A0B();
        C2K5 c2k5 = this.A0L;
        int i = c2k5.A02;
        if (i == 0) {
            c2k5.setLocationMode(1);
        } else if (i == 1) {
            c2k5.setLocationMode(0);
        } else if (i == 2) {
            c2k5.setLocationMode(1);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A0M.A0Y(i, i2)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        return true;
    }

    @Override // X.C21W, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0M = new C48922Hk(this, this.A0F, ((ActivityC02290Ap) this).A0A, this.A07, this.A0T, ((ActivityC02270An) this).A00, this.A0D, this.A0P, this.A09, this.A0A, this.A0C, ((ActivityC02310Ar) this).A01, this.A0B, this.A0J, this.A08, this.A0G, this.A06, this.A0N, this.A0E, this.A0K, this.A0O, this.A0Q);
        A0c().A0L(true);
        setContentView(R.layout.groupchat_live_locations);
        C0DK c0dk = this.A0H;
        AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
        if (A02 != null) {
            A0c().A0H(C002701i.A0g(this.A0C.A08(c0dk.A02(A02), false), this, ((ActivityC02290Ap) this).A0H));
            this.A0M.A0N(this, bundle);
            C41481tz.A02(this);
            C18350tb c18350tb = new C18350tb();
            c18350tb.A02 = 1;
            c18350tb.A08 = true;
            c18350tb.A04 = true;
            c18350tb.A05 = true;
            c18350tb.A07 = true;
            this.A0L = new C3Ll(this, this, c18350tb);
            View findViewById = findViewById(R.id.map_holder);
            if (findViewById != null) {
                ((ViewGroup) findViewById).addView(this.A0L);
                this.A0L.A0E(bundle);
                View findViewById2 = findViewById(R.id.my_location);
                if (findViewById2 != null) {
                    ImageView imageView = (ImageView) findViewById2;
                    this.A03 = imageView;
                    imageView.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 30));
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
        Dialog A03 = this.A0M.A03(i);
        return A03 != null ? A03 : super.onCreateDialog(i);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.map_layers, menu);
        menu.removeGroup(R.id.map_setting);
        return true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.A0L != null) {
            this.A0M.A0C();
            if (this.A05 != null) {
                SharedPreferences.Editor edit = this.A0R.A01(C02M.A02).edit();
                C015907l A02 = this.A05.A02();
                C016007m c016007m = A02.A03;
                edit.putFloat("live_location_lat", (float) c016007m.A00);
                edit.putFloat("live_location_lng", (float) c016007m.A01);
                edit.putFloat("live_location_zoom", A02.A02);
                edit.apply();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.A0L.A04();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A05 != null) {
            if (menuItem.getItemId() == 16908332) {
                finish();
                return true;
            }
            return false;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C2K5 c2k5 = this.A0L;
        if (c2k5 != null) {
            SensorManager sensorManager = c2k5.A04;
            if (sensorManager != null) {
                sensorManager.unregisterListener(c2k5.A09);
            }
            this.A0M.A0D();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        C2K5 c2k5 = this.A0L;
        if (c2k5 != null) {
            c2k5.A0M();
            this.A0M.A0E();
            A1Q();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0T4 c0t4 = this.A05;
        if (c0t4 != null) {
            C015907l A02 = c0t4.A02();
            bundle.putFloat("camera_zoom", A02.A02);
            C016007m c016007m = A02.A03;
            bundle.putDouble("camera_lat", c016007m.A00);
            bundle.putDouble("camera_lng", c016007m.A01);
            bundle.putInt("map_location_mode", this.A0L.A02);
        }
        this.A0L.A0G(bundle);
        this.A0M.A0O(bundle);
        super.onSaveInstanceState(bundle);
    }
}
