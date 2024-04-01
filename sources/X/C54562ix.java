package X;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.DocumentPickerActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ix  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54562ix extends C06020Rf implements InterfaceC09820eo, InterfaceC09830ep {
    public int A00;
    public C49042Ie A01;
    public final ActivityC02320As A02;
    public final C0B5 A03;
    public final C012005w A04;
    public final C018508q A05;
    public final C02L A06;
    public final C06950Vu A07;
    public final C0PH A08;
    public final C03150Ej A09;
    public final C03010Du A0A;
    public final C01B A0B;
    public final C06960Vv A0C;
    public final C40261rr A0D;
    public final InterfaceC04710Ln A0E;
    public final C58312qw A0F;
    public final C03120Eg A0G;
    public final InterfaceC05880Qp A0H;
    public final C000400f A0I;
    public final C02E A0J;
    public final C02F A0K;
    public final C000500h A0L;
    public final C003701t A0M;
    public final AnonymousClass011 A0N;
    public final AbstractC005302j A0O;
    public final C41471ty A0P;
    public final MentionableEntry A0Q;
    public final C0GZ A0R;
    public final C2MY A0S;
    public final C0DW A0T;
    public final C0DV A0U;
    public final C78373jo A0V;
    public final C2F8 A0W;
    public final C02O A0X;
    public final C2MD A0Y;
    public final C2MB A0Z;
    public final C41961un A0a;
    public final boolean A0b;

    @Override // X.InterfaceC09830ep
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public C54562ix(C0B5 c0b5, ActivityC02320As activityC02320As, C003701t c003701t, C018508q c018508q, C2MB c2mb, C02L c02l, C03010Du c03010Du, C012005w c012005w, AnonymousClass011 anonymousClass011, C06950Vu c06950Vu, C01B c01b, C06960Vv c06960Vv, C41471ty c41471ty, C2MD c2md, C41961un c41961un, C02E c02e, C0DV c0dv, C40261rr c40261rr, C2F8 c2f8, C000400f c000400f, C0GZ c0gz, C02F c02f, C000500h c000500h, C0DW c0dw, C2MY c2my, C03150Ej c03150Ej, C02O c02o, C03120Eg c03120Eg, InterfaceC04710Ln interfaceC04710Ln, InterfaceC05880Qp interfaceC05880Qp, AbstractC005302j abstractC005302j, boolean z, MentionableEntry mentionableEntry, C58312qw c58312qw, C78373jo c78373jo) {
        C0PH c0ph = new C0PH() { // from class: X.37V
            @Override // X.C0PH
            public final void AOK(boolean z2) {
                C49042Ie c49042Ie;
                C54562ix c54562ix = C54562ix.this;
                if (z2 && (c49042Ie = c54562ix.A01) != null && c49042Ie.isShowing()) {
                    c54562ix.A01.A03();
                }
            }
        };
        this.A08 = c0ph;
        this.A02 = activityC02320As;
        this.A03 = c0b5;
        this.A0M = c003701t;
        this.A05 = c018508q;
        this.A0Z = c2mb;
        this.A06 = c02l;
        this.A0A = c03010Du;
        this.A04 = c012005w;
        this.A0N = anonymousClass011;
        this.A07 = c06950Vu;
        this.A0B = c01b;
        this.A0C = c06960Vv;
        this.A0P = c41471ty;
        this.A0Y = c2md;
        this.A0a = c41961un;
        this.A0J = c02e;
        this.A0U = c0dv;
        this.A0D = c40261rr;
        this.A0W = c2f8;
        this.A0I = c000400f;
        this.A0R = c0gz;
        this.A0K = c02f;
        this.A0L = c000500h;
        this.A0T = c0dw;
        this.A0S = c2my;
        this.A09 = c03150Ej;
        this.A0X = c02o;
        this.A0G = c03120Eg;
        this.A0E = interfaceC04710Ln;
        this.A0H = interfaceC05880Qp;
        this.A0O = abstractC005302j;
        this.A0b = z;
        this.A0Q = mentionableEntry;
        this.A0F = c58312qw;
        this.A0V = c78373jo;
        c03150Ej.A01(c0ph);
    }

    public void A00() {
        ActivityC02320As activityC02320As = this.A02;
        if (RequestPermissionActivity.A0N(activityC02320As, this.A0K, 31) && this.A0I.A0A(this.A0H)) {
            C41961un.A0U(this.A05, this.A04, this.A0X, 23, activityC02320As, null);
        }
    }

    public void A01() {
        ActivityC02320As activityC02320As = this.A02;
        if (RequestPermissionActivity.A0N(activityC02320As, this.A0K, 32) && this.A0I.A0A(this.A0H)) {
            C41961un.A0U(this.A05, this.A04, this.A0X, 4, activityC02320As, null);
        }
    }

    public final void A02() {
        if (A0C(this.A0F.A05) && this.A0I.A0A(this.A0H)) {
            C41961un.A0U(this.A05, this.A04, this.A0X, 5, this.A02, this.A0O);
        }
    }

    public final void A03() {
        AnonymousClass092 ACf = this.A0E.ACf();
        ActivityC02320As activityC02320As = this.A02;
        Intent intent = new Intent(activityC02320As, PhoneContactsSelector.class);
        intent.putExtra("jid", C003101m.A07(this.A0O));
        intent.putExtra("quoted_message", ACf == null ? null : C0DB.A03(ACf.A0n));
        intent.putExtra("quoted_group_jid", C003101m.A07(C0DB.A04(ACf)));
        intent.putExtra("has_number_from_url", this.A0b);
        activityC02320As.startActivityForResult(intent, 9);
    }

    public final void A04() {
        if (A0C(this.A0F.A06) && this.A0I.A0A(this.A0H)) {
            ActivityC02320As activityC02320As = this.A02;
            AbstractC005302j abstractC005302j = this.A0O;
            Intent intent = new Intent(activityC02320As, DocumentPickerActivity.class);
            intent.putExtra("jid", abstractC005302j.getRawString());
            activityC02320As.startActivityForResult(intent, 6);
        }
    }

    public final void A05() {
        Class cls;
        AnonymousClass092 ACf = this.A0E.ACf();
        C41471ty c41471ty = this.A0P;
        ActivityC02320As activityC02320As = this.A02;
        if (c41471ty.A07(activityC02320As)) {
            cls = LocationPicker2.class;
        } else {
            cls = LocationPicker.class;
        }
        Intent intent = new Intent(activityC02320As, cls);
        intent.putExtra("jid", C003101m.A07(this.A0O));
        intent.putExtra("quoted_message_row_id", ACf == null ? 0L : ACf.A0p);
        intent.putExtra("quoted_group_jid", C003101m.A07(C0DB.A04(ACf)));
        intent.putExtra("has_number_from_url", this.A0b);
        activityC02320As.startActivityForResult(intent, this.A0F.A09);
    }

    public final void A06() {
        AnonymousClass092 ACf = this.A0E.ACf();
        if (A0C(this.A0F.A07) && this.A0I.A0A(this.A0H)) {
            ActivityC02320As activityC02320As = this.A02;
            AbstractC005302j abstractC005302j = this.A0O;
            long j = ACf == null ? 0L : ACf.A0p;
            C011005l A04 = C0DB.A04(ACf);
            boolean z = this.A0b;
            MentionableEntry mentionableEntry = this.A0Q;
            String A0t = C002701i.A0t(mentionableEntry.getStringText());
            List mentions = mentionableEntry.getMentions();
            int i = this.A00 == 5 ? 20 : 1;
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI, activityC02320As, GalleryPicker.class);
            intent.putExtra("max_items", 30);
            intent.putExtra("jid", abstractC005302j.getRawString());
            intent.putExtra("quoted_message_row_id", j);
            intent.putExtra("quoted_group_jid", C003101m.A07(A04));
            intent.putExtra("number_from_url", z);
            intent.putExtra("send", true);
            intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
            intent.putExtra("origin", i);
            intent.putExtra("android.intent.extra.TEXT", A0t);
            intent.putExtra("mentions", C003101m.A0E(mentions));
            activityC02320As.startActivityForResult(intent, 22);
        }
    }

    public final void A07() {
        if (A0C(this.A0F.A08) && this.A0I.A0A(this.A0H)) {
            C41961un.A0U(this.A05, this.A04, this.A0X, 21, this.A02, null);
        }
    }

    public void A08(int i) {
        int i2;
        C2F8 c2f8 = this.A0W;
        if (i == 1) {
            i2 = 2;
        } else {
            i2 = 3;
            if (i != 2) {
                i2 = 4;
                if (i != 3) {
                    i2 = 5;
                    if (i != 4) {
                        i2 = 6;
                        if (i != 5) {
                            if (i == 7) {
                                i2 = 7;
                            } else {
                                i2 = 1;
                                if (i == 6) {
                                    i2 = 8;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c2f8.A01 != 0 && Math.random() * 650 < 1.0d) {
            c2f8.A01 = 1;
            c2f8.A02 = SystemClock.elapsedRealtime();
            c2f8.A00 = i2;
        }
        ActivityC02320As activityC02320As = this.A02;
        int i3 = 30;
        Intent A02 = RequestPermissionActivity.A02(activityC02320As, this.A0K, 30);
        if (A02 == null) {
            C000400f c000400f = this.A0I;
            if (c000400f.A0A(this.A0H)) {
                if (c000400f.A02() < ((this.A0B.A07(C01C.A3Y) << 10) << 10)) {
                    C40731sm.A0c(this.A0N, activityC02320As, this.A03, 5);
                    c2f8.A01();
                    return;
                }
                C40261rr c40261rr = this.A0D;
                AbstractC005302j abstractC005302j = this.A0O;
                if (c40261rr.A0H(UserJid.of(abstractC005302j))) {
                    C002701i.A19(activityC02320As, 106);
                    c2f8.A01();
                    return;
                }
                AnonymousClass092 ACf = this.A0E.ACf();
                Intent intent = new Intent(activityC02320As, CameraActivity.class);
                intent.putExtra("jid", C003101m.A07(abstractC005302j));
                intent.putExtra("quoted_message_row_id", ACf == null ? 0L : ACf.A0p);
                intent.putExtra("quoted_group_jid", C003101m.A07(C0DB.A04(ACf)));
                intent.putExtra("chat_opened_from_url", this.A0b);
                intent.putExtra("origin", i);
                MentionableEntry mentionableEntry = this.A0Q;
                intent.putExtra("android.intent.extra.TEXT", C002701i.A0t(mentionableEntry.getStringText()));
                intent.putStringArrayListExtra("mentions", C003101m.A0E(mentionableEntry.getMentions()));
                activityC02320As.startActivityForResult(intent, this.A0F.A03);
                this.A0G.A03();
                return;
            }
        } else {
            if (i == 2) {
                i3 = this.A0F.A00;
            } else if (i == 3) {
                i3 = this.A0F.A01;
            } else if (i == 5) {
                i3 = this.A0F.A02;
            }
            activityC02320As.startActivityForResult(A02, i3);
        }
        c2f8.A01();
    }

    public void A09(Uri uri, Byte b, int i) {
        if (this.A0D.A0H(UserJid.of(this.A0O))) {
            C002701i.A19(this.A02, 106);
        } else {
            A0A(uri, b, i);
        }
    }

    public final void A0A(Uri uri, Byte b, int i) {
        long j;
        String str;
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            ActivityC02320As activityC02320As = this.A02;
            String A07 = C003101m.A07(this.A0O);
            C42611w2 c42611w2 = new C42611w2(uri);
            MentionableEntry mentionableEntry = this.A0Q;
            c42611w2.A0B(C002701i.A0t(mentionableEntry.getStringText()));
            c42611w2.A0C(AnonymousClass029.A0v(mentionableEntry.getMentions()));
            synchronized (c42611w2) {
                c42611w2.A07 = b;
            }
            Bundle A00 = new C2Gx(c42611w2).A00();
            AnonymousClass092 ACf = this.A0E.ACf();
            if (ACf != null) {
                j = ACf.A0p;
                str = C003101m.A07(C0DB.A04(ACf));
            } else {
                j = 0;
                str = null;
            }
            Intent intent = new Intent(activityC02320As, MediaComposerActivity.class);
            intent.putExtra("android.intent.extra.STREAM", arrayList);
            intent.putExtra("android.intent.extra.TEXT", (String) null);
            intent.putExtra("jid", A07);
            intent.putExtra("jids", (Serializable) null);
            intent.putExtra("max_items", 0);
            intent.putExtra("origin", i);
            intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
            intent.putExtra("send", true);
            intent.putExtra("quoted_message_row_id", j);
            intent.putExtra("quoted_group_jid", str);
            intent.putExtra("number_from_url", false);
            intent.putExtra("media_preview_params", A00);
            intent.putExtra("smb_quick_reply", false);
            intent.putExtra("start_home", false);
            intent.putExtra("animate_uri", (Parcelable) null);
            intent.putExtra("preselected_image_uri", (Parcelable) null);
            intent.putExtra("scan_for_qr", false);
            activityC02320As.startActivityForResult(intent, 22);
            return;
        }
        Log.e("conversation/setuppreview/share-failed");
        this.A05.A07(R.string.share_failed, 0);
    }

    public void A0B(View view, int i, boolean z) {
        ActivityC02320As activityC02320As = this.A02;
        C49042Ie c49042Ie = new C49042Ie(activityC02320As, this.A05, this.A0Z, view, this.A0O, z, this);
        this.A01 = c49042Ie;
        this.A00 = i;
        Resources resources = activityC02320As.getResources();
        int[] iArr = new int[2];
        View view2 = c49042Ie.A07;
        view2.getLocationOnScreen(iArr);
        boolean z2 = AnonymousClass088.A0M(activityC02320As).y - (view2.getHeight() + iArr[1]) < activityC02320As.getResources().getDimensionPixelSize(R.dimen.attach_popup_max_anchor) || (Build.VERSION.SDK_INT >= 24 && activityC02320As.isInMultiWindowMode());
        c49042Ie.A00 = view2.getWidth() / 2;
        if (z2) {
            c49042Ie.A07(activityC02320As, true, 300, c49042Ie.A02(activityC02320As));
        } else {
            c49042Ie.A07(activityC02320As, false, 300, resources.getDimensionPixelSize(R.dimen.attach_popup_top_margin));
        }
    }

    public final boolean A0C(int i) {
        if (this.A0K.A06()) {
            return true;
        }
        ActivityC02320As activityC02320As = this.A02;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.permission_storage_need_write_access_on_sending_media_v30;
        if (i2 < 30) {
            i3 = R.string.permission_storage_need_write_access_on_sending_media;
        }
        RequestPermissionActivity.A06(activityC02320As, R.string.permission_storage_need_write_access_on_sending_media_request, i3, false, i);
        return false;
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C49042Ie c49042Ie = this.A01;
        if (c49042Ie != null && c49042Ie.isShowing()) {
            this.A01.A03();
        }
        this.A09.A00(this.A08);
    }

    @Override // X.InterfaceC09820eo
    public boolean onActivityResult(int i, int i2, final Intent intent) {
        int i3;
        Uri fromFile;
        C58312qw c58312qw = this.A0F;
        if (i == c58312qw.A04) {
            A05();
            return true;
        } else if (i == 23 && i2 == 0) {
            C02O c02o = this.A0X;
            synchronized (C0DD.class) {
                if (C0DD.A00 > 0) {
                    SharedPreferences.Editor edit = c02o.A01(C02M.A02).edit();
                    int i4 = C0DD.A00 - 1;
                    C0DD.A00 = i4;
                    edit.putInt("file_index", i4);
                    edit.apply();
                }
            }
            return true;
        } else if (i2 != -1) {
            return false;
        } else {
            if (i != 30 && i != c58312qw.A00) {
                if (i == c58312qw.A01) {
                    i3 = 3;
                } else {
                    i3 = 5;
                    if (i != c58312qw.A02) {
                        if (i == 31) {
                            A00();
                            return true;
                        } else if (i == 32) {
                            A01();
                            return true;
                        } else if (i == 150) {
                            A03();
                            return true;
                        } else if (i == c58312qw.A07) {
                            A06();
                            return true;
                        } else if (i == c58312qw.A08) {
                            A07();
                            return true;
                        } else if (i == c58312qw.A05) {
                            A02();
                            return true;
                        } else if (i == c58312qw.A06) {
                            A04();
                            return true;
                        } else if (i == 44 || i == 88) {
                            return true;
                        } else {
                            if (i == 6) {
                                if (intent != null) {
                                    Uri data = intent.getData();
                                    if (data != null) {
                                        C03010Du c03010Du = this.A0A;
                                        AbstractC005302j abstractC005302j = this.A0O;
                                        String A0K = C0DD.A0K(this.A0J.A07(), data);
                                        AnonymousClass092 ACf = this.A0E.ACf();
                                        C0B5 c0b5 = this.A03;
                                        boolean z = this.A0b;
                                        if (c03010Du != null) {
                                            c03010Du.A08(Collections.singletonList(abstractC005302j), data, A0K, ACf, c0b5, z);
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                        if (parcelableArrayListExtra != null) {
                                            Iterator it = parcelableArrayListExtra.iterator();
                                            while (it.hasNext()) {
                                                Uri uri = (Uri) it.next();
                                                C03010Du c03010Du2 = this.A0A;
                                                AbstractC005302j abstractC005302j2 = this.A0O;
                                                String A0K2 = C0DD.A0K(this.A0J.A07(), uri);
                                                AnonymousClass092 ACf2 = this.A0E.ACf();
                                                C0B5 c0b52 = this.A03;
                                                boolean z2 = this.A0b;
                                                if (c03010Du2 != null) {
                                                    c03010Du2.A08(Collections.singletonList(abstractC005302j2), uri, A0K2, ACf2, c0b52, z2);
                                                } else {
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                    this.A0E.A5b();
                                    return true;
                                }
                                throw null;
                            } else if (i == 5) {
                                if (intent != null) {
                                    ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("result_uris");
                                    if (parcelableArrayListExtra2 == null) {
                                        if (intent.getData() != null) {
                                            parcelableArrayListExtra2 = new ArrayList();
                                            parcelableArrayListExtra2.add(intent.getData());
                                        } else {
                                            Log.w("(conversation|messagereply)/audio/share/failed");
                                            this.A05.A07(R.string.share_failed, 0);
                                            return true;
                                        }
                                    }
                                    Iterator it2 = parcelableArrayListExtra2.iterator();
                                    while (it2.hasNext()) {
                                        this.A0a.A0f((Uri) it2.next(), this.A03, new InterfaceC42681w9() { // from class: X.37P
                                            @Override // X.InterfaceC42681w9
                                            public final void AKN(File file) {
                                                C54562ix c54562ix = C54562ix.this;
                                                Intent intent2 = intent;
                                                try {
                                                    C03010Du c03010Du3 = c54562ix.A0A;
                                                    AbstractC005302j abstractC005302j3 = c54562ix.A0O;
                                                    C0DC c0dc = C0DC.A05;
                                                    boolean booleanExtra = intent2.getBooleanExtra("has_preview", true);
                                                    InterfaceC04710Ln interfaceC04710Ln = c54562ix.A0E;
                                                    c03010Du3.A0B(false, Collections.singletonList(abstractC005302j3), file, c0dc, booleanExtra, null, interfaceC04710Ln.ACf(), c54562ix.A0b);
                                                    interfaceC04710Ln.A5b();
                                                } catch (IOException e) {
                                                    c54562ix.A05.A07(R.string.share_failed, 0);
                                                    Log.e(e);
                                                }
                                            }
                                        });
                                        this.A0E.A5a();
                                    }
                                    return true;
                                }
                                throw null;
                            } else if (i == 23) {
                                Uri fromFile2 = Uri.fromFile(C02180Ae.A0e(this.A0X));
                                C0DD.A0N(this.A02, fromFile2);
                                A0A(fromFile2, null, 8);
                                return true;
                            } else if (i == 4) {
                                if (intent != null && intent.getData() != null) {
                                    fromFile = intent.getData();
                                } else {
                                    File A0e = C02180Ae.A0e(this.A0X);
                                    if (A0e.exists()) {
                                        fromFile = Uri.fromFile(A0e);
                                        C0DD.A0N(this.A02, fromFile);
                                    } else {
                                        StringBuilder sb = new StringBuilder("conversation/video/share/nocapturefile ");
                                        sb.append(A0e);
                                        Log.e(sb.toString());
                                        Log.w("conversation/video/share/failed");
                                        this.A05.A07(R.string.share_failed, 0);
                                        return true;
                                    }
                                }
                                if (fromFile != null) {
                                    A0A(fromFile, null, 8);
                                    return true;
                                }
                                Log.w("conversation/video/share/failed");
                                this.A05.A07(R.string.share_failed, 0);
                                return true;
                            } else if (i == 21) {
                                if (intent != null) {
                                    A0A(intent.getData(), null, 1);
                                }
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            } else {
                i3 = 2;
            }
            A08(i3);
            return true;
        }
    }
}
