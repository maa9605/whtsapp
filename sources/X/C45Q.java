package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.45Q */
/* loaded from: classes3.dex */
public class C45Q {
    public static InterfaceC25061Dx A00;
    public static HashMap A01;

    public static long A00(C016807u c016807u) {
        Object A002 = c016807u.A00.A00(AnonymousClass464.A00);
        if (A002 == null) {
            return 0L;
        }
        if (A002 instanceof String) {
            return AnonymousClass024.A03((String) A002, 0L);
        }
        if (A002 instanceof Number) {
            return ((Number) A002).longValue();
        }
        throw new IllegalArgumentException("Attempting to extract unrecognized type from countdown timer component");
    }

    public static AnonymousClass144 A01(String str, int i, boolean z, C0AL c0al, C25311Ew c25311Ew) {
        if (!z) {
            if (C09M.A00().A04 != null) {
                i = C893846u.A00(str);
            } else {
                throw new IllegalStateException("No minification reverse map configured. Unexpectedly attempting to handle an unminified payload.");
            }
        }
        AnonymousClass144 anonymousClass144 = new AnonymousClass144(i, z);
        if (c0al.AQh() != C0AM.START_OBJECT) {
            c0al.AUv();
            return null;
        }
        while (c0al.AGm() != C0AM.END_OBJECT) {
            String AQg = c0al.AQg();
            int A0C = AnonymousClass088.A0C(AQg, z);
            c0al.AGm();
            A0G(anonymousClass144, AQg, A0C, c0al, c25311Ew);
            c0al.AUv();
        }
        return anonymousClass144;
    }

    /* JADX WARN: Removed duplicated region for block: B:299:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C016807u A02(java.lang.String r5, int r6, boolean r7, X.C0AL r8, X.C25311Ew r9) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45Q.A02(java.lang.String, int, boolean, X.0AL, X.1Ew):X.07u");
    }

    public static AnonymousClass080 A03(C0AL c0al, C25311Ew c25311Ew) {
        ArrayList arrayList;
        String AVG;
        ArrayList arrayList2;
        C0AM c0am = C0AM.END_OBJECT;
        C0AM c0am2 = C0AM.START_OBJECT;
        C47B c47b = new C47B();
        if (c0al.AQh() != c0am2) {
            c0al.AUv();
            throw null;
        }
        while (c0al.AGm() != c0am) {
            String AQg = c0al.AQg();
            boolean z = AnonymousClass088.A0A(AQg) >= 32;
            int A0C = AnonymousClass088.A0C(AQg, z);
            c0al.AGm();
            if (z) {
                if (13323 == A0C) {
                    c47b.A07 = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13535 == A0C) {
                    c47b.A01 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13538 == A0C) {
                    c47b.A06 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13411 == A0C) {
                    c47b.A03 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13412 == A0C) {
                    c47b.A04 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13642 == A0C) {
                    c47b.A02 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13503 == A0C) {
                    c47b.A0J = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (14005 == A0C) {
                    c47b.A0G = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13764 == A0C) {
                    c47b.A05 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13502 == A0C) {
                    c47b.A0E = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13759 == A0C) {
                    c47b.A00 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13496 == A0C) {
                    c47b.A08 = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13499 == A0C) {
                    c47b.A0C = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13501 == A0C) {
                    c47b.A0D = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13498 == A0C) {
                    c47b.A0B = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13497 == A0C) {
                    c47b.A0A = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13889 == A0C) {
                    c47b.A0I = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13504 == A0C) {
                    c47b.A0F = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13948 == A0C) {
                    c47b.A0H = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (15763 == A0C) {
                    c47b.A09 = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13797 == A0C) {
                    ((C38971pM) c47b).A0J = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13666 == A0C) {
                    ((C38971pM) c47b).A0H = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13704 == A0C) {
                    ((C38971pM) c47b).A09 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13747 == A0C) {
                    ((C38971pM) c47b).A0A = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13647 == A0C) {
                    ((C38971pM) c47b).A04 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13690 == A0C) {
                    ((C38971pM) c47b).A0B = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13686 == A0C) {
                    ((C38971pM) c47b).A0C = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13689 == A0C) {
                    ((C38971pM) c47b).A0D = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13566 == A0C) {
                    ((C38971pM) c47b).A00 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13914 == A0C) {
                    ((C38971pM) c47b).A0E = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13750 == A0C) {
                    ((C38971pM) c47b).A06 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13768 == A0C) {
                    ((C38971pM) c47b).A0F = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13774 == A0C) {
                    ((C38971pM) c47b).A08 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13334 == A0C) {
                    ((C38971pM) c47b).A0I = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13799 == A0C) {
                    ((C38971pM) c47b).A02 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13800 == A0C) {
                    ((C38971pM) c47b).A01 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13808 == A0C) {
                    ((C38971pM) c47b).A03 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13784 == A0C) {
                    ((C38971pM) c47b).A07 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13785 == A0C) {
                    ((C38971pM) c47b).A05 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13798 == A0C) {
                    ((C38971pM) c47b).A0G = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13320 == A0C) {
                    c47b.A0N = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13335 == A0C) {
                    c47b.A0R = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13329 == A0C) {
                    c47b.A0Q = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13317 == A0C) {
                    c47b.A0M = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13326 == A0C) {
                    c47b.A0P = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13336 == A0C) {
                    c47b.A0S = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13735 == A0C) {
                    ((C1WK) c47b).A0E = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13901 == A0C) {
                    c47b.A0O = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if (13313 == A0C) {
                    ((C1WK) c47b).A01 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13535 == A0C) {
                    ((C1WK) c47b).A03 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13656 == A0C) {
                    ((C1WK) c47b).A0C = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13337 == A0C) {
                    ((C1WK) c47b).A0H = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13688 == A0C) {
                    c47b.A0K = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13347 == A0C) {
                    ((C1WK) c47b).A00 = C33781gS.A00(c0al, c25311Ew, z);
                } else if (13339 == A0C) {
                    c47b.A0L = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13314 == A0C) {
                    ((C1WK) c47b).A04 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13318 == A0C) {
                    ((C1WK) c47b).A06 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13340 == A0C) {
                    ((C1WK) c47b).A0J = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13332 == A0C) {
                    ((C1WK) c47b).A0F = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13333 == A0C) {
                    ((C1WK) c47b).A0G = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13330 == A0C) {
                    ((C1WK) c47b).A0D = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13319 == A0C) {
                    ((C1WK) c47b).A07 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13322 == A0C) {
                    ((C1WK) c47b).A09 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13365 == A0C) {
                    ((C1WK) c47b).A0I = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13346 == A0C) {
                    ((C1WK) c47b).A0B = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13343 == A0C) {
                    ((C1WK) c47b).A02 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13344 == A0C) {
                    ((C1WK) c47b).A0A = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13368 == A0C) {
                    ((C1WK) c47b).A08 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (13366 == A0C) {
                    ((C1WK) c47b).A05 = A01(AQg, A0C, z, c0al, c25311Ew);
                }
            } else if ("bk.components.Image".equals(AQg)) {
                c47b.A07 = A02(AQg, A0C, z, c0al, c25311Ew);
            } else {
                boolean equals = "bk.components.BottomSheet".equals(AQg);
                if (equals) {
                    c47b.A01 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.VisibilityExtension".equals(AQg)) {
                    c47b.A06 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("ig.components.screens.Navbar".equals(AQg)) {
                    c47b.A03 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("ig.components.screens.NavbarButton".equals(AQg)) {
                    c47b.A04 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("fb.components.ShopsNavBarExtension".equals(AQg)) {
                    c47b.A02 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.ListView".equals(AQg)) {
                    c47b.A0J = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.ShadowViewV2".equals(AQg)) {
                    c47b.A0G = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.type.OpenScreenOptions".equals(AQg)) {
                    c47b.A05 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.Image".equals(AQg)) {
                    c47b.A0E = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.type.ActionSheetButton".equals(AQg)) {
                    c47b.A00 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.CameraView".equals(AQg)) {
                    c47b.A08 = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.DatePicker".equals(AQg)) {
                    c47b.A0C = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.FormInput".equals(AQg)) {
                    c47b.A0D = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.CountDownTimer".equals(AQg)) {
                    c47b.A0B = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.CodeInput".equals(AQg)) {
                    c47b.A0A = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.VideoView".equals(AQg)) {
                    c47b.A0I = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.RichText".equals(AQg)) {
                    c47b.A0F = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.TextWithEntities".equals(AQg)) {
                    c47b.A0H = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("wa.components.CheckBox".equals(AQg)) {
                    c47b.A09 = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.component.TransitionContainer".equals(AQg)) {
                    ((C38971pM) c47b).A0J = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.Spinner".equals(AQg)) {
                    ((C38971pM) c47b).A0H = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.data.qpl.MarkerParams".equals(AQg)) {
                    ((C38971pM) c47b).A09 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.data.qpl.MarkerPointParams".equals(AQg)) {
                    ((C38971pM) c47b).A0A = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.screen.Screen".equals(AQg)) {
                    ((C38971pM) c47b).A04 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.screen.Navbar".equals(AQg)) {
                    ((C38971pM) c47b).A0B = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.screen.NavbarButton".equals(AQg)) {
                    ((C38971pM) c47b).A0C = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.screen.NavbarButtonIcon".equals(AQg)) {
                    ((C38971pM) c47b).A0D = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.AutomationTestExtension".equals(AQg)) {
                    ((C38971pM) c47b).A00 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.OnMount".equals(AQg)) {
                    ((C38971pM) c47b).A0E = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.data.screens.OpenFullScreenOptions".equals(AQg)) {
                    ((C38971pM) c47b).A06 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.BKSTextInputFormatter".equals(AQg)) {
                    ((C38971pM) c47b).A0F = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.KeyboardListenerExtension".equals(AQg)) {
                    ((C38971pM) c47b).A08 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.Switch".equals(AQg)) {
                    ((C38971pM) c47b).A0I = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.dialog.Dialog".equals(AQg)) {
                    ((C38971pM) c47b).A02 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.dialog.Button".equals(AQg)) {
                    ((C38971pM) c47b).A01 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.data.dialog.OpenDialogOptions".equals(AQg)) {
                    ((C38971pM) c47b).A03 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.data.screen.Screen".equals(AQg)) {
                    ((C38971pM) c47b).A07 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.data.screen.Navbar".equals(AQg)) {
                    ((C38971pM) c47b).A05 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.data.screens.CloseScreenOptions".equals(AQg)) {
                    ((C38971pM) c47b).A0G = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.Flexbox".equals(AQg)) {
                    c47b.A0N = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.Text".equals(AQg)) {
                    c47b.A0R = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.RichText".equals(AQg)) {
                    c47b.A0Q = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.Collection".equals(AQg)) {
                    c47b.A0M = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.ProgressBar".equals(AQg)) {
                    c47b.A0P = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.TextInput".equals(AQg)) {
                    c47b.A0S = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.ScrollToIndexByIdArgs".equals(AQg)) {
                    ((C1WK) c47b).A0E = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.ParseResultWrapper".equals(AQg)) {
                    c47b.A0O = A02(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.AccessibilityExtension".equals(AQg)) {
                    ((C1WK) c47b).A01 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if (equals) {
                    ((C1WK) c47b).A03 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.RenderLifecycleExtension".equals(AQg)) {
                    ((C1WK) c47b).A0C = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.TextInputMaskExtension".equals(AQg)) {
                    ((C1WK) c47b).A0H = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.ViewTransformsExtension".equals(AQg)) {
                    c47b.A0K = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.internal.Shadow".equals(AQg)) {
                    ((C1WK) c47b).A00 = C33781gS.A00(c0al, c25311Ew, z);
                } else if ("bk.components.TextSpan".equals(AQg)) {
                    c47b.A0L = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.BoxDecoration".equals(AQg)) {
                    ((C1WK) c47b).A04 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.ColorDrawable".equals(AQg)) {
                    ((C1WK) c47b).A06 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.ThemedColorDrawable".equals(AQg)) {
                    ((C1WK) c47b).A0J = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.StateDrawable".equals(AQg)) {
                    ((C1WK) c47b).A0F = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.StateDrawableItem".equals(AQg)) {
                    ((C1WK) c47b).A0G = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.RippleDrawable".equals(AQg)) {
                    ((C1WK) c47b).A0D = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.DatetimeTextProvider".equals(AQg)) {
                    ((C1WK) c47b).A07 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.GradientThemedColorDrawable".equals(AQg)) {
                    ((C1WK) c47b).A09 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.types.ThemedColor".equals(AQg)) {
                    ((C1WK) c47b).A0I = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.internal.Merge".equals(AQg)) {
                    ((C1WK) c47b).A0B = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.internal.Action".equals(AQg)) {
                    ((C1WK) c47b).A02 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bk.components.internal.Inflatable".equals(AQg)) {
                    ((C1WK) c47b).A0A = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("flex".equals(AQg)) {
                    ((C1WK) c47b).A08 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("collection".equals(AQg)) {
                    ((C1WK) c47b).A05 = A01(AQg, A0C, z, c0al, c25311Ew);
                } else if ("bloks_payload".equals(AQg)) {
                    C33901ge c33901ge = new C33901ge();
                    if (c0al.AQh() != c0am2) {
                        c0al.AUv();
                        c33901ge = null;
                    } else {
                        while (c0al.AGm() != c0am) {
                            String AQg2 = c0al.AQg();
                            c0al.AGm();
                            C0AM c0am3 = C0AM.END_ARRAY;
                            C0AM c0am4 = C0AM.START_ARRAY;
                            if ("tree".equals(AQg2)) {
                                c33901ge.A00 = C08i.A0A(c0al, c25311Ew);
                            } else if ("data".equals(AQg2)) {
                                if (c0al.AQh() == c0am4) {
                                    arrayList2 = new ArrayList();
                                    while (c0al.AGm() != c0am3) {
                                        C33911gf c33911gf = new C33911gf();
                                        if (c0al.AQh() != c0am2) {
                                            c0al.AUv();
                                        } else {
                                            while (c0al.AGm() != c0am) {
                                                String AQg3 = c0al.AQg();
                                                c0al.AGm();
                                                if ("id".equals(AQg3)) {
                                                    c33911gf.A01 = c0al.AQi().AFY() ? null : c0al.AQi().AVG();
                                                } else if ("type".equals(AQg3)) {
                                                    c33911gf.A02 = c0al.AQi().AFY() ? null : c0al.AQi().AVG();
                                                } else if ("data".equals(AQg3)) {
                                                    C25321Ex c25321Ex = new C25321Ex();
                                                    c25321Ex.A00 = AnonymousClass088.A19(c0al);
                                                    c33911gf.A00 = c25321Ex;
                                                }
                                                c0al.AUv();
                                            }
                                            arrayList2.add(c33911gf);
                                        }
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                c33901ge.A01 = arrayList2;
                            } else if ("referenced".equals(AQg2)) {
                                if (c0al.AQh() == c0am4) {
                                    arrayList = new ArrayList();
                                    while (c0al.AGm() != c0am3) {
                                        if (!c0al.AQi().AFY() && (AVG = c0al.AQi().AVG()) != null) {
                                            arrayList.add(AVG);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                c33901ge.A02 = arrayList;
                            }
                            c0al.AUv();
                        }
                    }
                    ((C17450s7) c47b).A00 = c33901ge;
                }
            }
            c0al.AUv();
        }
        AnonymousClass080 anonymousClass080 = c47b.A07;
        if (anonymousClass080 == null && (anonymousClass080 = c47b.A06) == null && (anonymousClass080 = c47b.A03) == null && (anonymousClass080 = c47b.A04) == null && (anonymousClass080 = c47b.A0J) == null && (anonymousClass080 = c47b.A0G) == null && (anonymousClass080 = c47b.A05) == null && (anonymousClass080 = c47b.A0E) == null && (anonymousClass080 = c47b.A00) == null && (anonymousClass080 = c47b.A08) == null && (anonymousClass080 = c47b.A0C) == null && (anonymousClass080 = c47b.A0D) == null && (anonymousClass080 = c47b.A0B) == null && (anonymousClass080 = c47b.A0A) == null && (anonymousClass080 = c47b.A0I) == null && (anonymousClass080 = c47b.A0F) == null && (anonymousClass080 = c47b.A0H) == null && (anonymousClass080 = c47b.A01) == null && (anonymousClass080 = c47b.A02) == null && (anonymousClass080 = c47b.A09) == null && (anonymousClass080 = ((C38971pM) c47b).A0J) == null && (anonymousClass080 = ((C38971pM) c47b).A0H) == null && (anonymousClass080 = ((C38971pM) c47b).A09) == null && (anonymousClass080 = ((C38971pM) c47b).A0A) == null && (anonymousClass080 = ((C38971pM) c47b).A04) == null && (anonymousClass080 = ((C38971pM) c47b).A0B) == null && (anonymousClass080 = ((C38971pM) c47b).A0C) == null && (anonymousClass080 = ((C38971pM) c47b).A0D) == null && (anonymousClass080 = ((C38971pM) c47b).A00) == null && (anonymousClass080 = ((C38971pM) c47b).A0E) == null && (anonymousClass080 = ((C38971pM) c47b).A06) == null && (anonymousClass080 = ((C38971pM) c47b).A0F) == null && (anonymousClass080 = ((C38971pM) c47b).A08) == null && (anonymousClass080 = ((C38971pM) c47b).A0I) == null && (anonymousClass080 = ((C38971pM) c47b).A02) == null && (anonymousClass080 = ((C38971pM) c47b).A01) == null && (anonymousClass080 = ((C38971pM) c47b).A03) == null && (anonymousClass080 = ((C38971pM) c47b).A07) == null && (anonymousClass080 = ((C38971pM) c47b).A05) == null && (anonymousClass080 = ((C38971pM) c47b).A0G) == null && (anonymousClass080 = c47b.A0N) == null && (anonymousClass080 = c47b.A0R) == null && (anonymousClass080 = c47b.A0Q) == null && (anonymousClass080 = c47b.A0S) == null && (anonymousClass080 = c47b.A0M) == null && (anonymousClass080 = c47b.A0P) == null && (anonymousClass080 = ((C1WK) c47b).A03) == null && (anonymousClass080 = ((C1WK) c47b).A0E) == null && (anonymousClass080 = c47b.A0O) == null && (anonymousClass080 = c47b.A0L) == null && (anonymousClass080 = ((C1WK) c47b).A04) == null && (anonymousClass080 = ((C1WK) c47b).A06) == null && (anonymousClass080 = ((C1WK) c47b).A0J) == null && (anonymousClass080 = ((C1WK) c47b).A0F) == null && (anonymousClass080 = ((C1WK) c47b).A0G) == null && (anonymousClass080 = ((C1WK) c47b).A0D) == null && (anonymousClass080 = ((C1WK) c47b).A07) == null && (anonymousClass080 = ((C1WK) c47b).A09) == null && (anonymousClass080 = ((C1WK) c47b).A0I) == null && (anonymousClass080 = ((C1WK) c47b).A01) == null && (anonymousClass080 = ((C1WK) c47b).A0C) == null && (anonymousClass080 = ((C1WK) c47b).A0H) == null && (anonymousClass080 = c47b.A0K) == null && (anonymousClass080 = ((C1WK) c47b).A00) == null && (anonymousClass080 = ((C1WK) c47b).A0B) == null && (anonymousClass080 = ((C1WK) c47b).A02) == null && (anonymousClass080 = ((C1WK) c47b).A0A) == null && (anonymousClass080 = ((C1WK) c47b).A08) == null && (anonymousClass080 = ((C1WK) c47b).A05) == null && (anonymousClass080 = ((C17450s7) c47b).A00) == null) {
            throw new IOException("unknown bloks data type");
        }
        return anonymousClass080;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.46s] */
    public static C893646s A04(String str, int i, int i2, Map map, List list) {
        boolean z = list.size() % 4 == 0;
        StringBuilder A0P = C000200d.A0P("BloksFieldStatParser/parseFieldStat/invalid serialization/length=");
        A0P.append(list.size());
        C000700j.A09(z, A0P.toString());
        int size = list.size() >> 2;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = i3 << 2;
            int intValue = ((Number) list.get(i4 + 2)).intValue();
            InterfaceC020509l interfaceC020509l = (InterfaceC020509l) list.get(i4 + 3);
            Object A06 = A06(intValue, interfaceC020509l, false);
            if (A06 != null) {
                arrayList.add(new C46G(((Number) list.get(i4)).intValue(), (String) AnonymousClass088.A0r((InterfaceC020509l) list.get(i4 + 1)), A06, A06(intValue, interfaceC020509l, true)));
            }
        }
        return new AnonymousClass014(str, i, i2, new AnonymousClass015(AnonymousClass024.A01((String) map.get("sample_rate_debug"), 1), AnonymousClass024.A01((String) map.get("sample_rate_beta"), 20), AnonymousClass024.A01((String) map.get("sample_rate_release"), 20), "1".equals(map.get("log_all_for_debug"))), (C46G[]) arrayList.toArray(new C46G[0])) { // from class: X.46s
            public final String A00;
            public final C46G[] A01;

            {
                super(i, r4, i2);
                this.A00 = str;
                this.A01 = r5;
            }

            @Override // X.AnonymousClass014
            public void serialize(C0SU c0su) {
                C46G[] c46gArr;
                for (C46G c46g : this.A01) {
                    c0su.ASd(c46g.A00, c46g.A02);
                }
            }

            @Override // X.AnonymousClass014
            public String toString() {
                C46G[] c46gArr;
                StringBuilder sb = new StringBuilder(256);
                sb.append(this.A00);
                sb.append(" {");
                for (C46G c46g : this.A01) {
                    Object obj = c46g.A01;
                    if (obj != null) {
                        AnonymousClass014.appendFieldToStringBuilder(sb, c46g.A03, String.valueOf(obj));
                    }
                }
                sb.append("}");
                return sb.toString();
            }
        };
    }

    public static File A05(C46H c46h, String str, boolean z) {
        StringBuilder A0V;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            return c46h.A00(str);
        }
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        if (z) {
            A0V = C000200d.A0V("VID_", format);
            str2 = ".mp4";
        } else {
            A0V = C000200d.A0V("IMG_", format);
            str2 = ".png";
        }
        A0V.append(str2);
        return c46h.A00(A0V.toString());
    }

    public static Object A06(int i, InterfaceC020509l interfaceC020509l, boolean z) {
        if (interfaceC020509l == null || interfaceC020509l == C0A6.A00) {
            return null;
        }
        if (i == 1) {
            return Boolean.valueOf(1 == ((Number) interfaceC020509l).intValue());
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        C000200d.A0p("BloksFieldStatParser/parseValue/unknown type/type=", i);
                        return null;
                    }
                    String str = (String) AnonymousClass088.A0r(interfaceC020509l);
                    if (str == null) {
                        return null;
                    }
                    String[] split = TextUtils.split(str, "\\|");
                    int length = split.length;
                    if (length == 2) {
                        return z ? split[1] : Integer.valueOf(AnonymousClass024.A01(split[0], -1));
                    }
                    StringBuilder A0P = C000200d.A0P("BloksFieldStatParser/parseValue/invalid enum format/length=");
                    A0P.append(length);
                    Log.e(A0P.toString());
                    return null;
                }
                return AnonymousClass088.A0r(interfaceC020509l);
            }
            return Float.valueOf(((Number) interfaceC020509l).floatValue());
        } else {
            return Long.valueOf(((Number) interfaceC020509l).longValue());
        }
    }

    public static Date A07(String str) {
        C000700j.A03(str);
        try {
            return new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(str);
        } catch (ParseException e) {
            Log.e("Couldn't parse the date", e);
            return null;
        }
    }

    public static Map A08(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(AnonymousClass088.A0f(entry.getKey()), AnonymousClass088.A0f(entry.getValue()));
        }
        return hashMap;
    }

    public static Map A09(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(AnonymousClass088.A0f(entry.getKey()), AnonymousClass088.A0f(entry.getValue()));
        }
        return hashMap;
    }

    public static void A0A() {
        if (A01 == null || A00 == null) {
            C647234l c647234l = new InterfaceC25301Ev() { // from class: X.34l
                @Override // X.InterfaceC25301Ev
                public final Object AQZ(C0AL c0al, C25311Ew c25311Ew) {
                    return C45Q.A03(c0al, c25311Ew);
                }
            };
            A00 = new InterfaceC25061Dx() { // from class: X.34m
                @Override // X.InterfaceC25061Dx
                public final C33391fp A6g(AbstractC016907v abstractC016907v) {
                    return new C33391fp(new C0AO(abstractC016907v, Collections.emptyList()));
                }
            };
            HashMap hashMap = new HashMap();
            A01 = hashMap;
            hashMap.put(AnonymousClass080.class, c647234l);
        }
    }

    public static void A0B(View view, AnonymousClass087 anonymousClass087, C016807u c016807u) {
        TextView textView = (TextView) view.findViewById(R.id.text);
        String str = (String) c016807u.A00.A00(AnonymousClass462.A02);
        if (str != null) {
            textView.setText(str);
        }
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkbox);
        final View findViewById = view.findViewById(R.id.wabloks_checkbox);
        String str2 = (String) c016807u.A00.A00(AnonymousClass462.A00);
        if (str2 != null && str2.equals("error")) {
            final float x = findViewById.getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(x, findViewById.getResources().getDimensionPixelSize(R.dimen.error_wiggle_animation_offset) + x);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.2nY
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    findViewById.setX(((Number) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.45h
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    findViewById.setX(x);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    findViewById.setX(x);
                }
            });
            ofFloat.start();
            AnonymousClass088.A1g(C02E.A00());
        }
        findViewById.setOnClickListener(new C2nU(checkBox, c016807u, anonymousClass087));
    }

    public static void A0C(View view, AnonymousClass087 anonymousClass087, C016807u c016807u) {
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) view.findViewById(R.id.video_view);
        final View findViewById = view.findViewById(R.id.loading_progress);
        final View findViewById2 = view.findViewById(R.id.play_button);
        String str = (String) c016807u.A00.A00(C46C.A01);
        String absolutePath = TextUtils.isEmpty(str) ? null : ((C891245t) AnonymousClass088.A0o(anonymousClass087, c016807u)).A00.A00(str).getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath)) {
            videoSurfaceView.setVideoPath(absolutePath);
        }
        videoSurfaceView.A0B = new MediaPlayer.OnPreparedListener() { // from class: X.2nW
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                findViewById.setVisibility(8);
            }
        };
        videoSurfaceView.A09 = new MediaPlayer.OnCompletionListener() { // from class: X.2nV
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                findViewById2.setVisibility(0);
            }
        };
        findViewById2.setOnClickListener(new View$OnClickListenerC56522nT(findViewById2, videoSurfaceView));
        if (!c016807u.A8Z(C46C.A00, false)) {
            findViewById2.setVisibility(0);
            return;
        }
        videoSurfaceView.start();
        findViewById2.setVisibility(8);
    }

    public static void A0D(CheckBox checkBox, C016807u c016807u, AnonymousClass087 anonymousClass087) {
        boolean z = !checkBox.isChecked() ? 1 : 0;
        checkBox.setChecked(z);
        C09P AA3 = c016807u.AA3(AnonymousClass462.A01);
        if (AA3 != null) {
            int i = ((AbstractC016907v) c016807u).A00;
            ArrayList arrayList = new ArrayList();
            AbstractC021009q A0c = AnonymousClass088.A0c(z ? 1 : 0);
            if (arrayList.size() == 0) {
                arrayList.add(A0c);
                C25031Du.A00(i, AA3, new C021109r(arrayList), anonymousClass087);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }

    public static void A0E(AnonymousClass087 anonymousClass087, ImageView imageView, String str, C46Z c46z, String str2, AnonymousClass081 anonymousClass081) {
        Bitmap bitmap;
        if (str2 != null) {
            InterfaceC24961Dn interfaceC24961Dn = ((C892046c) anonymousClass087.A02).A02;
            Context context = anonymousClass087.A00;
            if (interfaceC24961Dn != null) {
                if (AnonymousClass029.A1K(context)) {
                    str = str2;
                }
            } else {
                throw null;
            }
        }
        C892946l c892946l = new C892946l(anonymousClass081, anonymousClass087, imageView);
        C06F c06f = c46z.A04;
        Reference reference = (Reference) c06f.A04(str);
        if (reference != null && (bitmap = (Bitmap) reference.get()) != null) {
            c892946l.A00(bitmap);
        } else {
            ((AbstractC42201vM) c46z).A05.ARy(new C0HS(c46z, str, c06f, c892946l) { // from class: X.46Y
                public final C06F A00;
                public final C46Z A01;
                public final C892946l A02;
                public final String A03;

                {
                    this.A01 = c46z;
                    this.A03 = str;
                    this.A00 = c06f;
                    this.A02 = c892946l;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    File A002 = this.A01.A00(C46Z.A0G);
                    if (A002 == null) {
                        Log.e("BloksAssetManager/getBitmap/unable to get images directory");
                        return null;
                    }
                    return BitmapFactory.decodeFile(new File(A002, this.A03).getAbsolutePath());
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    Bitmap bitmap2 = (Bitmap) obj;
                    if (bitmap2 != null) {
                        this.A00.A08(this.A03, new WeakReference(bitmap2));
                        this.A02.A00(bitmap2);
                    } else if (this.A02 != null) {
                        Log.e("ImageComponentBinder/bindView/bitmap read failed");
                    } else {
                        throw null;
                    }
                }
            }, new Void[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0084, code lost:
        if (r4.equals("video") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x008e, code lost:
        if (r4.equals("image") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0023, code lost:
        if (r4.equals("image_and_video") == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0F(X.AnonymousClass087 r7, X.C016807u r8, X.C890845p r9) {
        /*
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r4 = r9.A0B
            int r2 = r4.hashCode()
            r3 = 0
            r6 = 1
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r2 == r0) goto L87
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r2 == r0) goto L7d
            r0 = 124969519(0x772e22f, float:1.8272526E-34)
            if (r2 != r0) goto L25
            java.lang.String r0 = "image_and_video"
            boolean r0 = r4.equals(r0)
            r5 = 1
            if (r0 != 0) goto L26
        L25:
            r5 = -1
        L26:
            java.lang.String r4 = "video_file_name"
            if (r5 == 0) goto L77
            java.lang.String r2 = "image_file_name"
            if (r5 == r6) goto L5a
            java.lang.String r0 = r9.A0A
            r1.put(r2, r0)
        L33:
            X.09P r4 = r9.A07
            if (r4 == 0) goto L59
            if (r7 == 0) goto L59
            int r3 = r8.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r0 = A08(r1)
            X.09l r1 = X.AnonymousClass088.A0f(r0)
            int r0 = r2.size()
            if (r0 != 0) goto L91
            r2.add(r1)
            X.09r r0 = new X.09r
            r0.<init>(r2)
            X.C25031Du.A00(r3, r4, r0, r7)
        L59:
            return
        L5a:
            boolean r0 = r9.A0F
            if (r0 != 0) goto L68
            boolean r0 = r9.A0D
            if (r0 == 0) goto L68
            X.47A r0 = r9.A09
            A0H(r8, r9, r0)
            return
        L68:
            java.lang.String r0 = r9.A0A
            r1.put(r2, r0)
            java.lang.String r0 = r9.A0C
            r1.put(r4, r0)
            r9.A0F = r3
            r9.A0D = r3
            goto L33
        L77:
            java.lang.String r0 = r9.A0C
            r1.put(r4, r0)
            goto L33
        L7d:
            java.lang.String r0 = "video"
            boolean r0 = r4.equals(r0)
            r5 = 0
            if (r0 != 0) goto L26
            goto L25
        L87:
            java.lang.String r0 = "image"
            boolean r0 = r4.equals(r0)
            r5 = 2
            if (r0 != 0) goto L26
            goto L25
        L91:
            java.lang.String r1 = "arguments have to be continuous"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45Q.A0F(X.087, X.07u, X.45p):void");
    }

    public static void A0G(AnonymousClass081 anonymousClass081, String str, int i, C0AL c0al, C25311Ew c25311Ew) {
        if (str == null) {
            return;
        }
        int ordinal = c0al.AQh().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            while (c0al.AGm() != C0AM.END_ARRAY) {
                if (c0al.AQh() == C0AM.START_OBJECT) {
                    AnonymousClass080 A0A = C08i.A0A(c0al, c25311Ew);
                    if (A0A != null) {
                        arrayList.add(A0A);
                    }
                } else {
                    arrayList.add(AnonymousClass088.A0p(c0al));
                }
            }
            anonymousClass081.AQy(str, i, arrayList);
        } else if (ordinal == 2) {
            anonymousClass081.AQy(str, i, C08i.A0A(c0al, c25311Ew));
        } else if (ordinal == 5) {
            anonymousClass081.AQy(str, i, c0al.AQi().AVG());
        } else if (ordinal == 6) {
            anonymousClass081.AQy(str, i, AnonymousClass088.A0b(c0al.AQi()));
        } else if (ordinal == 7) {
            anonymousClass081.AQy(str, i, c0al.AQi().AGq());
        } else if (ordinal == 8) {
            anonymousClass081.AQy(str, i, Boolean.valueOf(c0al.AQi().A5n()));
        }
    }

    public static void A0H(C016807u c016807u, C890845p c890845p, SurfaceView surfaceView) {
        CamcorderProfile camcorderProfile;
        if (c890845p.A0E) {
            c890845p.A05.stop();
            A0P(c890845p);
            c890845p.A04.lock();
            c890845p.A0E = false;
        } else {
            c890845p.A05 = new MediaRecorder();
            c890845p.A04.unlock();
            c890845p.A05.setCamera(c890845p.A04);
            c890845p.A05.setVideoSource(1);
            if (CamcorderProfile.hasProfile(c890845p.A00, 4)) {
                camcorderProfile = CamcorderProfile.get(c890845p.A00, 4);
            } else if (CamcorderProfile.hasProfile(c890845p.A00, 5)) {
                camcorderProfile = CamcorderProfile.get(c890845p.A00, 5);
            } else {
                camcorderProfile = CamcorderProfile.get(c890845p.A00, 1);
            }
            c890845p.A05.setOutputFormat(camcorderProfile.fileFormat);
            c890845p.A05.setVideoFrameRate(camcorderProfile.videoFrameRate);
            c890845p.A05.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            c890845p.A05.setVideoEncodingBitRate(256000);
            c890845p.A05.setVideoEncoder(camcorderProfile.videoCodec);
            c890845p.A05.setOutputFile(A05(c890845p.A0H, (String) c016807u.A00.A00(AnonymousClass461.A06), true).getPath());
            c890845p.A05.setOrientationHint(360 - c890845p.A09.getDisplayOrientation());
            c890845p.A05.setPreviewDisplay(surfaceView.getHolder().getSurface());
            try {
                c890845p.A05.prepare();
                c890845p.A05.start();
                c890845p.A0E = true;
            } catch (IOException e) {
                e.getMessage();
                A0P(c890845p);
                A0P(c890845p);
                new Handler().postDelayed(new RunnableC56512nR(c890845p, c016807u), Integer.parseInt((String) c016807u.A00.A00(AnonymousClass461.A05)));
            } catch (IllegalStateException e2) {
                e2.getMessage();
                A0P(c890845p);
                A0P(c890845p);
                new Handler().postDelayed(new RunnableC56512nR(c890845p, c016807u), Integer.parseInt((String) c016807u.A00.A00(AnonymousClass461.A05)));
            }
        }
        new Handler().postDelayed(new RunnableC56512nR(c890845p, c016807u), Integer.parseInt((String) c016807u.A00.A00(AnonymousClass461.A05)));
    }

    public static void A0I(C016807u c016807u, C893446q c893446q, AnonymousClass087 anonymousClass087) {
        C09P AA3 = c016807u.AA3(C46B.A03);
        if (AA3 != null) {
            int i = ((AbstractC016907v) c016807u).A00;
            ArrayList arrayList = new ArrayList();
            InterfaceC020509l A0f = AnonymousClass088.A0f(c893446q.A02);
            if (arrayList.size() == 0) {
                arrayList.add(A0f);
                C25031Du.A00(i, AA3, new C021109r(arrayList), anonymousClass087);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }

    public static void A0J(CodeInputField codeInputField, final AnonymousClass087 anonymousClass087, final C016807u c016807u) {
        boolean z = !Boolean.FALSE.equals(Boolean.valueOf(c016807u.A8Z(AnonymousClass463.A02, true)));
        InterfaceC26591Jv interfaceC26591Jv = new InterfaceC26591Jv() { // from class: X.46k
            @Override // X.InterfaceC26591Jv
            public void AIf(String str) {
                C016807u c016807u2 = c016807u;
                C09P AA3 = c016807u2.AA3(AnonymousClass463.A04);
                if (AA3 != null && str.length() == c016807u2.A04(AnonymousClass463.A03, 0)) {
                    int i = ((AbstractC016907v) c016807u2).A00;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(str);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25031Du.A00(i, AA3, new C021109r(arrayList), anonymousClass087);
                        return;
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            }

            @Override // X.InterfaceC26591Jv
            public void AMT(String str) {
                C016807u c016807u2 = c016807u;
                c016807u2.A00.A02(AnonymousClass463.A06, str);
                C09P AA3 = c016807u2.AA3(AnonymousClass463.A04);
                if (AA3 != null) {
                    int i = ((AbstractC016907v) c016807u2).A00;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(str);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25031Du.A00(i, AA3, new C021109r(arrayList), anonymousClass087);
                        return;
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            }
        };
        if (z) {
            AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u.A00.A00(AnonymousClass463.A07);
            codeInputField.A05(c016807u.A04(AnonymousClass463.A03, 0), interfaceC26591Jv, anonymousClass081 != null ? AnonymousClass088.A06(anonymousClass081, anonymousClass087) : 0);
            return;
        }
        codeInputField.A06(interfaceC26591Jv, c016807u.A04(AnonymousClass463.A03, 0));
    }

    public static void A0K(TextEmojiLabel textEmojiLabel, final AnonymousClass087 anonymousClass087, final C016807u c016807u) {
        C890745o c890745o;
        try {
            c890745o = (C890745o) AnonymousClass088.A0o(anonymousClass087, c016807u);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("bind/exception parsing formatted string: ");
            sb.append(e);
            AnonymousClass088.A1i("WaTextWithEntitiesComponentBinder", sb.toString());
        }
        if (c890745o != null) {
            String str = (String) c016807u.A00.A00(C46B.A07);
            if (str != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                List<String> AAv = c016807u.AAv(C46B.A05);
                if (AAv != null) {
                    for (String str2 : AAv) {
                        JSONObject jSONObject = new JSONObject(str2);
                        int i = jSONObject.getInt("offset");
                        int i2 = jSONObject.getInt("length");
                        String string = jSONObject.getString("style");
                        switch (string.hashCode()) {
                            case -2125451728:
                                if (string.equals("ITALIC")) {
                                    spannableStringBuilder.setSpan(new StyleSpan(2), i, i2 + i, 0);
                                    break;
                                } else {
                                    break;
                                }
                            case 2044549:
                                if (string.equals("BOLD")) {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i, i2 + i, 0);
                                    break;
                                } else {
                                    break;
                                }
                            case 1759631020:
                                if (string.equals("UNDERLINE")) {
                                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2 + i, 0);
                                    break;
                                } else {
                                    break;
                                }
                            case 2143721139:
                                if (string.equals("STRIKETHROUGH")) {
                                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2 + i, 0);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                List<String> AAv2 = c016807u.AAv(C46B.A00);
                if (AAv2 != null) {
                    for (String str3 : AAv2) {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        int i3 = jSONObject2.getInt("offset");
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(jSONObject2.getInt("color")), i3, jSONObject2.getInt("length") + i3, 0);
                    }
                }
                List<String> AAv3 = c016807u.AAv(C46B.A02);
                if (AAv3 != null) {
                    for (String str4 : AAv3) {
                        final C893446q c893446q = new C893446q(new JSONObject(str4));
                        C02740Cr c02740Cr = new C02740Cr(anonymousClass087.A00, c890745o.A00, c890745o.A02, c890745o.A01, c893446q.A02);
                        c02740Cr.A00 = new InterfaceC26801Ks() { // from class: X.34k
                            @Override // X.InterfaceC26801Ks
                            public final void A6E() {
                                C45Q.A0I(c016807u, c893446q, anonymousClass087);
                            }
                        };
                        int i4 = c893446q.A01;
                        spannableStringBuilder.setSpan(c02740Cr, i4, c893446q.A00 + i4, 0);
                    }
                }
                List<String> AAv4 = c016807u.AAv(C46B.A04);
                if (AAv4 != null) {
                    for (String str5 : AAv4) {
                        JSONObject jSONObject3 = new JSONObject(str5);
                        int i5 = jSONObject3.getInt("offset");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan((float) jSONObject3.getDouble("scale")), i5, jSONObject3.getInt("length") + i5, 0);
                    }
                }
                textEmojiLabel.setText(spannableStringBuilder);
            }
            String str6 = (String) c016807u.A00.A00(C46B.A06);
            if (str6 != null) {
                try {
                    textEmojiLabel.setGravity(C08i.A05(str6));
                } catch (C018208m e2) {
                    AnonymousClass088.A1j("WaTextWithEntitiesComponentBinder", "Failed to parse textAlign", e2);
                }
            }
            String str7 = (String) c016807u.A00.A00(C46B.A08);
            if (str7 != null) {
                try {
                    textEmojiLabel.setTextSize(C08i.A02(str7));
                } catch (C018208m e3) {
                    AnonymousClass088.A1j("WaTextWithEntitiesComponentBinder", "Failed to parse text size", e3);
                }
            }
            String str8 = (String) c016807u.A00.A00(C46B.A01);
            if (str8 != null) {
                try {
                    textEmojiLabel.setLineHeight((int) C08i.A01(str8));
                    return;
                } catch (C018208m e4) {
                    AnonymousClass088.A1j("WaTextWithEntitiesComponentBinder", "Failed to parse line height pixel value", e4);
                    return;
                }
            }
            return;
        }
        throw null;
    }

    public static void A0L(C45S c45s, View view, AnonymousClass087 anonymousClass087, C016807u c016807u) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.A0i = true;
        String str = (String) c016807u.A00.A00(AnonymousClass468.A05);
        try {
            JSONArray jSONArray = new JSONArray(str);
            recyclerView.setAdapter(new C893246o(new C647434n(c016807u, anonymousClass087), LayoutInflater.from(anonymousClass087.A00), c45s.A00(), jSONArray, c016807u.AA3(AnonymousClass468.A07), (String) c016807u.A00.A00(AnonymousClass468.A06), (String) c016807u.A00.A00(AnonymousClass468.A08), (String) c016807u.A00.A00(AnonymousClass468.A04), (String) c016807u.A00.A00(AnonymousClass468.A0A), (String) c016807u.A00.A00(AnonymousClass468.A00), (String) c016807u.A00.A00(AnonymousClass468.A01), (String) c016807u.A00.A00(AnonymousClass468.A03), c016807u.A8Z(AnonymousClass468.A09, false), c016807u.A8Z(AnonymousClass468.A02, false)));
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("WaListViewBinder/bindView data source is not a valid JSON: ");
            sb.append(str);
            AnonymousClass088.A1i("WaRcListViewBinderUtil", sb.toString());
        }
    }

    public static void A0M(C45W c45w, C91604Fo c91604Fo) {
        AnonymousClass080 anonymousClass080 = c45w.A00;
        if (anonymousClass080 != null) {
            C44J.A00(new RunnableC75033eF(c91604Fo.A00, (AnonymousClass081) anonymousClass080));
            return;
        }
        Log.e("Action is null after parsing");
        AbstractC90224Ae.A00(c91604Fo.A00);
        C74993eB c74993eB = new C74993eB(C000200d.A0H("Bloks: AsyncAction error - ", "Action is null after parsing"));
        Log.e(c74993eB);
        c74993eB.getMessage();
    }

    public static /* synthetic */ void A0N(C45Y c45y, InterfaceC889445b interfaceC889445b) {
        AbstractC016907v abstractC016907v = c45y.A00;
        if (abstractC016907v != null) {
            interfaceC889445b.AIr(abstractC016907v);
            return;
        }
        Log.e("Layout is null after parsing");
        interfaceC889445b.AJt("Layout is null after parsing");
    }

    public static void A0O(C892046c c892046c, C09P c09p, C021109r c021109r) {
        C25311Ew c25311Ew = C09M.A00().A09;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_global_bloks_host, c892046c);
        sparseArray.put(R.id.bloks_global_parser_map, c25311Ew);
        C25021Dt c25021Dt = new C25021Dt(new C09w());
        InterfaceC24961Dn interfaceC24961Dn = c892046c.A02;
        if (interfaceC24961Dn != null) {
            C09w c09w = c25021Dt.A00;
            if (c09w != null) {
                C09v c09v = new C09v(c09w);
                InterfaceC021309t interfaceC021309t = C09M.A00().A0A;
                if (interfaceC24961Dn != null) {
                    C25011Ds.A00(c09p, c021109r, new C25011Ds(new C021209s(sparseArray, c09v, interfaceC021309t)).A00);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static void A0P(C890845p c890845p) {
        MediaRecorder mediaRecorder = c890845p.A05;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            c890845p.A05.release();
            c890845p.A05 = null;
            Camera camera = c890845p.A04;
            if (camera != null) {
                camera.lock();
            }
        }
    }

    public static void A0Q(C890845p c890845p, C016807u c016807u) {
        c890845p.A0F = true;
        try {
            c890845p.A05.stop();
        } catch (RuntimeException e) {
            Log.w("WaBloksCameraViewBinder/stop-video-capture ", e);
        }
        A0P(c890845p);
        Camera camera = c890845p.A04;
        if (camera != null) {
            camera.lock();
        }
        c890845p.A0E = false;
        A0F(c890845p.A06, c016807u, c890845p);
    }

    public static void A0R(String str, InterfaceC889445b interfaceC889445b) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            C33831gX c33831gX = new C33831gX(jsonReader);
            c33831gX.AGm();
            A0A();
            C25311Ew c25311Ew = new C25311Ew(A01);
            C45Y c45y = new C45Y();
            if (c33831gX.A01 != C0AM.START_OBJECT) {
                c33831gX.AUv();
                c45y = null;
            } else {
                while (c33831gX.AGm() != C0AM.END_OBJECT) {
                    String str2 = c33831gX.A02;
                    AnonymousClass088.A0C(str2, false);
                    c33831gX.AGm();
                    if ("layout".equals(str2)) {
                        c45y.A00 = (AbstractC016907v) C08i.A0A(c33831gX, c25311Ew);
                    }
                    c33831gX.AUv();
                }
            }
            new Handler(Looper.getMainLooper()).post(new C2nS(c45y, interfaceC889445b));
            jsonReader.close();
        } catch (Exception e) {
            Log.e("Error when parsing bloks payload json", e);
            interfaceC889445b.AJt(e.getMessage());
        }
    }

    public static int[] A0S(String str) {
        Date A07 = A07(str);
        int[] iArr = {-1, -1, -1};
        if (A07 == null) {
            return iArr;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(A07);
        return new int[]{calendar.get(5), calendar.get(2), calendar.get(1)};
    }
}
