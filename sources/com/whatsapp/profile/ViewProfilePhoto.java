package com.whatsapp.profile;

import X.AbstractActivityC49962Og;
import X.AbstractC005302j;
import X.AbstractC012105x;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass024;
import X.C000200d;
import X.C000400f;
import X.C002701i;
import X.C011005l;
import X.C011505r;
import X.C011605s;
import X.C012005w;
import X.C018508q;
import X.C018708s;
import X.C02180Ae;
import X.C02F;
import X.C02L;
import X.C03320Ff;
import X.C03360Fk;
import X.C04400Ka;
import X.C04510Kl;
import X.C05W;
import X.C06C;
import X.C08930cL;
import X.C0AT;
import X.C0C8;
import X.C0DD;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0K1;
import X.C0LF;
import X.C0U1;
import X.C0VJ;
import X.C13460lI;
import X.C1M4;
import X.C1M6;
import X.C2HC;
import X.C2Oe;
import X.C3T8;
import X.C3T9;
import X.C42461vm;
import X.C456723a;
import X.C456823b;
import X.InterfaceC05880Qp;
import X.InterfaceC61212vm;
import X.InterfaceC61762wg;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.BidiToolbar;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.crop.CropImage;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class ViewProfilePhoto extends AbstractActivityC49962Og {
    public C012005w A00;
    public C02L A01;
    public C011605s A02;
    public C03320Ff A03;
    public C05W A04;
    public AnonymousClass008 A05;
    public C018708s A06;
    public C011505r A07;
    public C0LF A08;
    public C000400f A09;
    public C02F A0A;
    public C0C8 A0B;
    public C06C A0C;
    public C456823b A0E;
    public C03360Fk A0F;
    public C04400Ka A0G;
    public C456723a A0H;
    public C42461vm A0I;
    public boolean A0K = false;
    public boolean A0J = false;
    public final Handler A0L = new Handler(Looper.getMainLooper()) { // from class: X.3T7
        {
            ViewProfilePhoto.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
            C018508q c018508q = ((ActivityC02290Ap) viewProfilePhoto).A0A;
            boolean A0C = viewProfilePhoto.A0C.A0C();
            int i = R.string.failed_update_profile_photo;
            if (A0C) {
                i = R.string.failed_update_photo;
            }
            c018508q.A07(i, 0);
            viewProfilePhoto.findViewById(R.id.progress_bar).setVisibility(8);
        }
    };
    public final C0GA A0N = new C0GA() { // from class: X.3kt
        {
            ViewProfilePhoto.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            ViewProfilePhoto.A00(ViewProfilePhoto.this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x006b, code lost:
            if (r4.A01 != (-1)) goto L36;
         */
        @Override // X.C0GA
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void A01(X.AbstractC005302j r9) {
            /*
                r8 = this;
                com.whatsapp.profile.ViewProfilePhoto r7 = com.whatsapp.profile.ViewProfilePhoto.this
                X.05W r2 = r7.A04
                X.06C r0 = r7.A0C
                java.lang.Class<X.02j> r1 = X.AbstractC005302j.class
                com.whatsapp.jid.Jid r0 = r0.A03(r1)
                if (r0 == 0) goto La4
                X.02j r0 = (X.AbstractC005302j) r0
                X.06C r0 = r2.A0A(r0)
                r7.A0C = r0
                com.whatsapp.jid.Jid r0 = r0.A03(r1)
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L8d
                java.lang.String r0 = "viewprofilephoto/onprofilephotochanged photo_full_id:"
                java.lang.StringBuilder r2 = X.C000200d.A0P(r0)
                X.06C r1 = r7.A0C
                int r0 = r1.A01
                r2.append(r0)
                java.lang.String r0 = " thumb_full_id:"
                r2.append(r0)
                int r0 = r1.A02
                X.C000200d.A1F(r2, r0)
                X.02F r1 = r7.A0A
                java.lang.String r0 = android.os.Environment.getExternalStorageState()
                boolean r0 = r1.A0A(r0)
                android.os.Handler r3 = r7.A0L
                r5 = 0
                r3.removeMessages(r5)
                r6 = 1
                if (r0 == 0) goto L5b
                X.06C r0 = r7.A0C
                int r2 = r0.A01
                if (r2 != 0) goto L5b
                X.0Ka r1 = r7.A0G
                r0 = 0
                r1.A02(r9, r2, r6, r0)
                r0 = 32000(0x7d00, double:1.581E-319)
                r3.sendEmptyMessageDelayed(r5, r0)
            L5b:
                r7.A1P()
                r7.invalidateOptionsMenu()
                X.06C r4 = r7.A0C
                int r3 = r4.A02
                r2 = -1
                if (r3 != r2) goto L6d
                int r0 = r4.A01
                r1 = 1
                if (r0 == r2) goto L6e
            L6d:
                r1 = 0
            L6e:
                if (r3 != 0) goto La2
                int r0 = r4.A01
                if (r0 != 0) goto La2
            L74:
                boolean r0 = r7.A0K
                if (r0 == 0) goto L8d
                r7.A0K = r5
                if (r1 == 0) goto L8e
                X.08q r2 = r7.A0A
                boolean r1 = r4.A0C()
                r0 = 2131889270(0x7f120c76, float:1.9413199E38)
                if (r1 == 0) goto L8a
                r0 = 2131887853(0x7f1206ed, float:1.9410325E38)
            L8a:
                r2.A07(r0, r5)
            L8d:
                return
            L8e:
                if (r6 == 0) goto L8d
                X.08q r2 = r7.A0A
                boolean r1 = r4.A0C()
                r0 = 2131889271(0x7f120c77, float:1.94132E38)
                if (r1 == 0) goto L9e
                r0 = 2131887854(0x7f1206ee, float:1.9410327E38)
            L9e:
                r2.A07(r0, r5)
                return
            La2:
                r6 = 0
                goto L74
            La4:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C78993kt.A01(X.02j):void");
        }

        @Override // X.C0GA
        public void A02(AbstractC005302j abstractC005302j) {
            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
            C05W c05w = viewProfilePhoto.A04;
            Jid A03 = viewProfilePhoto.A0C.A03(AbstractC005302j.class);
            if (A03 != null) {
                C06C A0A = c05w.A0A((AbstractC005302j) A03);
                viewProfilePhoto.A0C = A0A;
                if (abstractC005302j.equals(A0A.A03(AbstractC005302j.class))) {
                    StringBuilder A0P = C000200d.A0P("viewprofilephoto/onProfilePhotoStartChanging photo_full_id:");
                    C06C c06c = viewProfilePhoto.A0C;
                    A0P.append(c06c.A01);
                    A0P.append(" thumb_full_id:");
                    C000200d.A1F(A0P, c06c.A02);
                    if (viewProfilePhoto.A0J) {
                        viewProfilePhoto.A0J = false;
                        return;
                    } else {
                        viewProfilePhoto.A0K = true;
                        return;
                    }
                }
                return;
            }
            throw null;
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
            C05W c05w = viewProfilePhoto.A04;
            Jid A03 = viewProfilePhoto.A0C.A03(AbstractC005302j.class);
            if (A03 != null) {
                C06C A0A = c05w.A0A((AbstractC005302j) A03);
                viewProfilePhoto.A0C = A0A;
                if (A0A.A0C()) {
                    return;
                }
                viewProfilePhoto.A1B(viewProfilePhoto.A06.A08(viewProfilePhoto.A0C, false));
                return;
            }
            throw null;
        }
    };
    public final C0GC A0M = new C0GC() { // from class: X.3ku
        {
            ViewProfilePhoto.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            ViewProfilePhoto.A00(ViewProfilePhoto.this);
        }
    };
    public final C0GE A0O = new C0GE() { // from class: X.3kv
        {
            ViewProfilePhoto.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            ViewProfilePhoto.A00(ViewProfilePhoto.this);
        }
    };
    public InterfaceC61762wg A0D = new InterfaceC61762wg() { // from class: X.3kl
        {
            ViewProfilePhoto.this = this;
        }

        @Override // X.InterfaceC61762wg
        public final void AGo(AbstractC005302j abstractC005302j) {
            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
            C06C c06c = viewProfilePhoto.A0C;
            if (c06c != null) {
                Jid A02 = c06c.A02();
                if (A02 == null) {
                    throw null;
                }
                if (A02.equals(abstractC005302j)) {
                    viewProfilePhoto.A0R();
                }
            }
        }
    };

    /* loaded from: classes2.dex */
    public class SavePhoto extends C2Oe {
        public C012005w A00;
        public C018508q A01;

        @Override // X.C2Oe, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setTitle(R.string.save_to_gallery);
            Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
            String replaceAll = getIntent().getStringExtra("name").replaceAll("[?:\\\\/*\"<>|]", "");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
            File file = this.A00.A04().A0G;
            AbstractC012105x.A03(file, false);
            StringBuilder A0V = C000200d.A0V(replaceAll, " ");
            A0V.append(simpleDateFormat.format(new Date()));
            A0V.append(".jpg");
            File file2 = new File(file, A0V.toString());
            try {
                C012005w c012005w = this.A00;
                AnonymousClass024.A0P(c012005w.A04, new File(uri.getPath()), file2);
                C0DD.A0N(this, Uri.fromFile(file2));
                this.A01.A07(R.string.photo_saved_to_gallery, 0);
            } catch (IOException e) {
                Log.e("viewprofilephoto/save/failed", e);
                this.A01.A07(R.string.photo_faled_save_to_gallery, 1);
            }
            finish();
        }
    }

    public static void A00(ViewProfilePhoto viewProfilePhoto) {
        C05W c05w = viewProfilePhoto.A04;
        Jid A03 = viewProfilePhoto.A0C.A03(AbstractC005302j.class);
        if (A03 != null) {
            C06C A0A = c05w.A0A((AbstractC005302j) A03);
            viewProfilePhoto.A0C = A0A;
            if (A0A.A0C()) {
                viewProfilePhoto.setTitle(R.string.group_photo);
                return;
            } else {
                viewProfilePhoto.A1B(viewProfilePhoto.A06.A08(viewProfilePhoto.A0C, false));
                return;
            }
        }
        throw null;
    }

    public final void A1P() {
        View findViewById = findViewById(R.id.progress_bar);
        PhotoView photoView = (PhotoView) findViewById(R.id.picture);
        TextView textView = (TextView) findViewById(R.id.message);
        ImageView imageView = (ImageView) findViewById(R.id.picture_animation);
        if (C04510Kl.A00((AbstractC005302j) this.A0C.A03(AbstractC005302j.class))) {
            findViewById.setVisibility(0);
            photoView.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        try {
            InputStream A03 = this.A08.A03(this.A0C, true);
            if (A03 == null) {
                photoView.setVisibility(8);
                findViewById.setVisibility(8);
                textView.setVisibility(0);
                imageView.setVisibility(8);
                if (this.A0C.A0C()) {
                    textView.setText(R.string.no_group_photo);
                    return;
                } else {
                    textView.setText(R.string.no_profile_photo);
                    return;
                }
            }
            photoView.setVisibility(0);
            textView.setVisibility(8);
            if (this.A0C.A01 == 0) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            Bitmap A0A = C002701i.A0A(A03, options);
            photoView.A06(A0A);
            imageView.setImageBitmap(A0A);
            A03.close();
        } catch (IOException unused) {
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 12) {
            if (i2 != -1) {
                return;
            }
            if (intent != null && intent.getBooleanExtra("is_reset", false)) {
                this.A0J = true;
                this.A05.A04((AbstractC005302j) this.A0C.A03(AbstractC005302j.class));
                this.A0H.A06(this.A0C);
                A0Q();
                return;
            }
            this.A0H.A05(this, intent, 13, this);
        } else if (i != 13) {
            super.onActivityResult(i, i2, intent);
        } else {
            if (!this.A0H.A03().delete()) {
                StringBuilder A0P = C000200d.A0P("viewprofilephoto/failed-delete-file");
                A0P.append(this.A0H.A03().getAbsolutePath());
                Log.w(A0P.toString());
            }
            if (i2 != -1) {
                if (i2 != 0 || intent == null) {
                    return;
                }
                CropImage.A00(this.A0H.A02, intent, this);
                return;
            }
            this.A0J = true;
            this.A05.A04((AbstractC005302j) this.A0C.A03(AbstractC005302j.class));
            if (!this.A0H.A09(this.A0C)) {
                return;
            }
            A1P();
        }
    }

    @Override // X.AbstractActivityC49962Og, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int intExtra = getIntent().getIntExtra("start_transition_status_bar_color", 0);
        final int intExtra2 = getIntent().getIntExtra("return_transition_status_bar_color", intExtra);
        final boolean z = C2HC.A00;
        if (z) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            Transition c3t8 = new C3T8(this, getIntent().getFloatExtra("start_transition_alpha", 0.0f), intExtra);
            Transition c3t9 = new C3T9(this, intExtra2);
            c3t8.excludeTarget(16908335, true);
            c3t8.excludeTarget(16908336, true);
            Window window = getWindow();
            window.setEnterTransition(c3t8);
            window.setReturnTransition(c3t9);
            c3t8.addListener(new C1M6() { // from class: X.3kw
                {
                    ViewProfilePhoto.this = this;
                }

                @Override // X.C1M6, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
                    View findViewById = viewProfilePhoto.findViewById(R.id.picture);
                    View findViewById2 = viewProfilePhoto.findViewById(R.id.picture_animation);
                    findViewById.setVisibility(0);
                    findViewById2.setVisibility(4);
                    viewProfilePhoto.getWindow().setStatusBarColor(-16777216);
                }
            });
            c3t9.addListener(new C1M6() { // from class: X.3kx
                {
                    ViewProfilePhoto.this = this;
                }

                @Override // X.C1M6, android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
                    View findViewById = viewProfilePhoto.findViewById(R.id.picture);
                    View findViewById2 = viewProfilePhoto.findViewById(R.id.picture_animation);
                    findViewById.setVisibility(4);
                    findViewById2.setVisibility(0);
                }
            });
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                Context applicationContext = getApplicationContext();
                Transition c1m4 = new C1M4(true, false);
                c1m4.addTarget(applicationContext.getResources().getString(R.string.transition_photo));
                window.setSharedElementEnterTransition(c1m4);
                Transition c1m42 = new C1M4(false, true);
                c1m42.addTarget(applicationContext.getResources().getString(R.string.transition_photo));
                window.setSharedElementReturnTransition(c1m42);
            } else if (getIntent().hasExtra("circular_return_name")) {
                Transition c1m43 = new C1M4(false, false);
                c1m43.addTarget(getIntent().getStringExtra("circular_return_name"));
                window.setSharedElementEnterTransition(c1m43);
                Transition c1m44 = new C1M4(false, true);
                c1m44.addTarget(getIntent().getStringExtra("circular_return_name"));
                window.setSharedElementReturnTransition(c1m44);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.view_profile_photo);
        final BidiToolbar bidiToolbar = (BidiToolbar) findViewById(R.id.toolbar);
        A0k(bidiToolbar);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
            if (A02 != null) {
                this.A0C = this.A04.A0A(A02);
                C000200d.A1F(C000200d.A0T("viewprofilephoto/create ", A02, " photo_full_id:"), this.A0C.A01);
                this.A05.A01(this.A0N);
                this.A03.A01(this.A0M);
                this.A0F.A01(this.A0O);
                C02L c02l = this.A01;
                c02l.A05();
                C0K1 c0k1 = c02l.A01;
                if (c0k1 == null) {
                    Log.i("viewprofilephoto/create/no-me");
                    if (((ActivityC02290Ap) this).A0A != null) {
                        startActivity(new Intent(this, Main.class));
                        finish();
                        return;
                    }
                    throw null;
                }
                if (this.A0C.A0C()) {
                    setTitle(R.string.group_photo);
                } else if (A02.equals(c0k1.A09)) {
                    setTitle(R.string.profile_photo);
                } else {
                    A1B(this.A06.A08(this.A0C, false));
                }
                if (!A02.equals(c0k1.A09)) {
                    if (this.A09.A0A(new InterfaceC05880Qp() { // from class: X.3ky
                        {
                            ViewProfilePhoto.this = this;
                        }

                        @Override // X.InterfaceC05880Qp
                        public void ANZ(String str) {
                            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
                            viewProfilePhoto.A0I.A03(viewProfilePhoto);
                        }

                        @Override // X.InterfaceC05880Qp
                        public void ANa() {
                            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
                            int i = Build.VERSION.SDK_INT;
                            int i2 = R.string.permission_storage_need_write_access_on_profile_photo_view_v30;
                            if (i < 30) {
                                i2 = R.string.permission_storage_need_write_access_on_profile_photo_view;
                            }
                            RequestPermissionActivity.A05(viewProfilePhoto, R.string.permission_storage_need_write_access_on_profile_photo_view_request, i2);
                        }

                        @Override // X.InterfaceC05880Qp
                        public void AQ0(String str) {
                            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
                            viewProfilePhoto.A0I.A03(viewProfilePhoto);
                        }

                        @Override // X.InterfaceC05880Qp
                        public void AQ1() {
                            ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
                            int i = Build.VERSION.SDK_INT;
                            int i2 = R.string.permission_storage_need_write_access_v30;
                            if (i < 30) {
                                i2 = R.string.permission_storage_need_write_access;
                            }
                            RequestPermissionActivity.A05(viewProfilePhoto, R.string.permission_storage_need_write_access_request, i2);
                        }
                    })) {
                        C06C c06c = this.A0C;
                        if (c06c.A01 > 0 && !this.A07.A03(c06c).exists()) {
                            this.A0C.A01 = 0;
                        }
                        this.A0G.A02((AbstractC005302j) this.A0C.A03(AbstractC005302j.class), this.A0C.A01, 1, null);
                        if (this.A0C.A01 == 0) {
                            this.A0L.sendEmptyMessageDelayed(0, 32000L);
                        }
                    }
                } else {
                    C06C c06c2 = this.A0C;
                    if (c06c2.A01 > 0 && !this.A07.A03(c06c2).exists()) {
                        C06C c06c3 = this.A0C;
                        c06c3.A01 = 0;
                        this.A0G.A02((AbstractC005302j) c06c3.A03(AbstractC005302j.class), this.A0C.A01, 1, null);
                        this.A0L.sendEmptyMessageDelayed(0, 32000L);
                    }
                }
                Bitmap A022 = this.A08.A02(this, this.A0C, getResources().getDimensionPixelSize(R.dimen.small_avatar_size), getResources().getDimension(R.dimen.small_avatar_radius), true);
                final PhotoView photoView = (PhotoView) findViewById(R.id.picture);
                photoView.A0Y = true;
                if (1 == 0) {
                    photoView.A02();
                }
                photoView.A08 = 1.0f;
                photoView.A06(A022);
                ImageView imageView = (ImageView) findViewById(R.id.picture_animation);
                imageView.setImageBitmap(A022);
                A1P();
                if (z) {
                    photoView.setVisibility(4);
                    imageView.setVisibility(0);
                    String stringExtra = getIntent().getStringExtra("circular_return_name");
                    if (stringExtra == null) {
                        stringExtra = getApplicationContext().getResources().getString(R.string.transition_photo);
                    }
                    C0AT.A0e(imageView, stringExtra);
                } else {
                    imageView.setVisibility(8);
                }
                View findViewById = findViewById(R.id.root_view);
                VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(this) { // from class: com.whatsapp.profile.ViewProfilePhoto.10
                    @Override // com.whatsapp.gesture.VerticalSwipeDismissBehavior, X.AbstractC08910cJ
                    public boolean A0B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                        if (motionEvent.getPointerCount() <= 1 && !photoView.A0A()) {
                            return super.A0B(coordinatorLayout, view, motionEvent);
                        }
                        C13460lI c13460lI = this.A05;
                        if (c13460lI != null) {
                            c13460lI.A02();
                            return false;
                        }
                        return false;
                    }
                };
                final Drawable colorDrawable = new ColorDrawable(-16777216);
                findViewById.setBackground(colorDrawable);
                verticalSwipeDismissBehavior.A02 = 0.5f;
                verticalSwipeDismissBehavior.A0B = true;
                verticalSwipeDismissBehavior.A08 = z;
                verticalSwipeDismissBehavior.A06 = new InterfaceC61212vm() { // from class: X.3ks
                    @Override // X.InterfaceC61212vm
                    public void AJc(int i) {
                    }

                    @Override // X.InterfaceC61212vm
                    public void AOa(View view) {
                    }

                    {
                        ViewProfilePhoto.this = this;
                    }

                    @Override // X.InterfaceC61212vm
                    public void AJR(View view) {
                        if (z) {
                            ViewProfilePhoto.this.onBackPressed();
                            return;
                        }
                        ViewProfilePhoto viewProfilePhoto = ViewProfilePhoto.this;
                        viewProfilePhoto.finish();
                        viewProfilePhoto.overridePendingTransition(0, 0);
                    }

                    @Override // X.InterfaceC61212vm
                    public void AOl(View view, float f) {
                        int i;
                        float f2 = 1.0f - f;
                        float f3 = f2 < 0.8f ? 0.0f : (f2 - 0.8f) / 0.19999999f;
                        colorDrawable.setAlpha((int) (255.0f * f3));
                        bidiToolbar.setAlpha(f3);
                        if (Build.VERSION.SDK_INT < 21 || (i = intExtra2) == 0) {
                            return;
                        }
                        ViewProfilePhoto.this.getWindow().setStatusBarColor(C09990f7.A04(i, -16777216, f3));
                    }
                };
                ((C08930cL) findViewById(R.id.content).getLayoutParams()).A00(verticalSwipeDismissBehavior);
                C456823b c456823b = this.A0E;
                c456823b.A00.add(this.A0D);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        C06C c06c = this.A0C;
        C02L c02l = this.A01;
        c02l.A05();
        if (c06c.equals(c02l.A01) || this.A0C.A0C()) {
            menu.add(0, R.id.menuitem_edit, 0, R.string.edit_photo).setIcon(R.drawable.ic_action_edit).setShowAsAction(2);
            menu.add(0, 1, 0, R.string.share).setIcon(R.drawable.ic_action_share).setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0L.removeMessages(0);
        this.A05.A00(this.A0N);
        this.A03.A00(this.A0M);
        C456823b c456823b = this.A0E;
        c456823b.A00.remove(this.A0D);
        this.A0F.A00(this.A0O);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_edit) {
            this.A0H.A04(this, this.A0C, 12);
            return true;
        } else if (itemId != 1) {
            if (itemId == 16908332) {
                C0VJ.A0B(this);
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        } else {
            C012005w c012005w = this.A00;
            C06C c06c = this.A0C;
            C02L c02l = this.A01;
            c02l.A05();
            File A01 = AbstractC012105x.A01(c012005w.A0B(), c06c.equals(c02l.A01) ? "me.jpg" : "photo.jpg");
            try {
                FileInputStream fileInputStream = new FileInputStream(this.A07.A03(this.A0C));
                try {
                    AnonymousClass024.A0V(fileInputStream, new FileOutputStream(A01));
                    Uri A04 = AnonymousClass024.A04(this, A01);
                    this.A02.A03().A04(A04.toString());
                    startActivity(C02180Ae.A0H(Arrays.asList(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", A04), new Intent(this, SavePhoto.class).putExtra("android.intent.extra.STREAM", Uri.fromFile(A01)).putExtra("name", this.A06.A08(this.A0C, false))), null, null));
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } catch (IOException e) {
                Log.e(e);
                ((ActivityC02290Ap) this).A0A.A07(R.string.photo_faled_save_to_gallery, 1);
                return true;
            }
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.size() != 0) {
            C06C c06c = this.A0C;
            C02L c02l = this.A01;
            c02l.A05();
            boolean equals = c06c.equals(c02l.A01);
            if (equals || this.A0C.A0C()) {
                boolean z = true;
                menu.findItem(1).setVisible(this.A07.A03(this.A0C).exists());
                MenuItem findItem = menu.findItem(R.id.menuitem_edit);
                if (!equals) {
                    C0C8 c0c8 = this.A0B;
                    Jid A03 = this.A0C.A03(C011005l.class);
                    if (A03 != null) {
                        if (!c0c8.A06((GroupJid) A03) && this.A0C.A0Z) {
                            z = false;
                        }
                    } else {
                        throw null;
                    }
                }
                findItem.setVisible(z);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0K = bundle.getBoolean("photo_change_requested_externally");
        this.A0J = bundle.getBoolean("photo_change_requested_by_phone");
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("photo_change_requested_externally", this.A0K);
        bundle.putBoolean("photo_change_requested_by_phone", this.A0J);
    }
}
