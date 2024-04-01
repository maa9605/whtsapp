package X;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.camera.LauncherCameraActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0M6 */
/* loaded from: classes.dex */
public class C0M6 {
    public static final int A00 = 8;
    public static final int A01 = 20;
    public static final int A02 = 72;
    public static final int A03 = 108;
    public static final String A04 = "com.whatsapp.sharing.category.SHARE_TARGET_DEFAULT";
    public static final Set A05 = new HashSet<String>() { // from class: X.1Ld
        {
            add(C0M6.A04);
        }
    };

    public static int A00(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            return 8;
        }
        if (i >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 0;
    }

    public static ShortcutInfo A01(int i, Context context, C06C c06c, C0L7 c0l7, C05W c05w, C018708s c018708s, C0LF c0lf) {
        Log.i("WaShortcutsApiHelper/createShortcutForContact");
        Jid A022 = c06c.A02();
        if (A022 != null) {
            ShortcutInfo.Builder rank = new ShortcutInfo.Builder(context, A022.getRawString()).setShortLabel(c018708s.A08(c06c, false)).setCategories(A05).setLongLived(true).setRank(i);
            Intent A023 = Conversation.A02(context, (AbstractC005302j) c06c.A03(AbstractC005302j.class));
            C002701i.A1B(A023, "WaShortcutsHelper");
            ShortcutInfo.Builder intent = rank.setIntent(A023.setAction("android.intent.action.VIEW"));
            Bitmap A024 = c0lf.A02(context, c06c, 72, 0.0f, true);
            if (A024 == null) {
                A024 = C0L7.A01(c0l7.A01.A00, c0l7.A03(c06c), 72, 0.0f);
            }
            intent.setIcon(Icon.createWithAdaptiveBitmap(A02(A024)));
            if (C003101m.A0b(c06c.A02())) {
                intent.setPerson(new Person.Builder().setName(c018708s.A08(c06c, false)).setUri(A06(context, c06c, c05w)).build());
            }
            return intent.build();
        }
        throw null;
    }

    public static Bitmap A02(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(0.0f, 0.0f, 108.0f, 108.0f);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColor(-1);
        canvas.drawRect(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (canvas.getWidth() - bitmap.getWidth()) / 2.0f, (canvas.getHeight() - bitmap.getHeight()) / 2.0f, paint);
        return createBitmap;
    }

    public static C12810k6 A03(Context context, C06C c06c, C05W c05w, C018708s c018708s) {
        C12800k5 c12800k5 = new C12800k5();
        c12800k5.A01 = c018708s.A08(c06c, false);
        c12800k5.A03 = A06(context, c06c, c05w);
        return new C12810k6(c12800k5);
    }

    public static C0M2 A04(int i, Context context, C06C c06c, C0L7 c0l7, C05W c05w, C018708s c018708s, C0LF c0lf) {
        Log.i("WaShortcutsApiHelper/createShortcutCompatForContact");
        Jid A022 = c06c.A02();
        if (A022 != null) {
            String rawString = A022.getRawString();
            C0M2 c0m2 = new C0M2();
            c0m2.A02 = context;
            c0m2.A07 = rawString;
            c0m2.A05 = c018708s.A08(c06c, false);
            c0m2.A08 = A05;
            c0m2.A0A = true;
            c0m2.A00 = i;
            Intent A023 = Conversation.A02(context, (AbstractC005302j) c06c.A03(AbstractC005302j.class));
            C002701i.A1B(A023, "WaShortcutsHelper");
            c0m2.A0B = new Intent[]{A023.setAction("android.intent.action.VIEW")};
            Bitmap A024 = c0lf.A02(context, c06c, 72, 0.0f, true);
            if (A024 == null) {
                A024 = C0L7.A01(c0l7.A01.A00, c0l7.A03(c06c), 72, 0.0f);
            }
            Bitmap A025 = A02(A024);
            if (A025 != null) {
                IconCompat iconCompat = new IconCompat(5);
                iconCompat.A06 = A025;
                c0m2.A03 = iconCompat;
                if (C003101m.A0b(c06c.A02())) {
                    c0m2.A0C = new C12810k6[]{A03(context, c06c, c05w, c018708s)};
                }
                if (!TextUtils.isEmpty(c0m2.A05)) {
                    Intent[] intentArr = c0m2.A0B;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    return c0m2;
                }
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        throw null;
    }

    public static C0M2 A05(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0M2 c0m2 = (C0M2) it.next();
            if (c0m2.A07.equals(str)) {
                return c0m2;
            }
        }
        return null;
    }

    public static String A06(Context context, C06C c06c, C05W c05w) {
        Uri A042 = c05w.A04(c06c, context.getContentResolver());
        if (A042 != null) {
            return A042.toString();
        }
        return null;
    }

    public static List A07(C05M c05m, C05W c05w, C40261rr c40261rr, C03730Gv c03730Gv, C0C8 c0c8, C0DK c0dk) {
        ArrayList A0Y = C000200d.A0Y("WaShortcutsApiHelper/getFrequentContacts");
        Iterator it = ((AbstractCollection) c03730Gv.A02(null)).iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            C06C A09 = c05w.A09(abstractC005302j);
            if (A09 != null && !c40261rr.A0H(UserJid.of(abstractC005302j)) && !c05m.A0G(abstractC005302j) && !C003101m.A0Y(abstractC005302j) && !C003101m.A0Z(abstractC005302j) && (!A09.A0C() || c0c8.A05((GroupJid) abstractC005302j))) {
                A0Y.add(A09);
            }
        }
        boolean isEmpty = A0Y.isEmpty();
        ArrayList arrayList = A0Y;
        if (isEmpty) {
            Log.i("WaShortcutsApiHelper/getFrequentContacts/get N contacts");
            List A042 = c0dk.A04(20);
            boolean isEmpty2 = ((AbstractCollection) A042).isEmpty();
            arrayList = A042;
            if (isEmpty2) {
                Log.i("WaShortcutsApiHelper/getFrequentContacts/get contact picker list");
                c05w.A05.A0V(A042, 0, false, false);
                arrayList = A042;
            }
        }
        return arrayList;
    }

    public static void A08(Context context) {
        C0M7.A03(context);
    }

    public static void A09(Context context) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        List<ShortcutInfo> shortcuts = shortcutManager.getShortcuts(8);
        ArrayList arrayList = new ArrayList();
        for (ShortcutInfo shortcutInfo : shortcuts) {
            arrayList.add(shortcutInfo.getId());
        }
        shortcutManager.removeLongLivedShortcuts(arrayList);
    }

    public static synchronized void A0D(Context context, AbstractC000600i abstractC000600i, C05M c05m, C0L7 c0l7, C05W c05w, C018708s c018708s, C40261rr c40261rr, C02F c02f, C03730Gv c03730Gv, C0C8 c0c8, C0LF c0lf, C0DK c0dk) {
        synchronized (C0M6.class) {
            List A07 = A07(c05m, c05w, c40261rr, c03730Gv, c0c8, c0dk);
            ArrayList arrayList = new ArrayList();
            if (c02f.A07()) {
                C0M2 c0m2 = new C0M2();
                c0m2.A02 = context;
                c0m2.A07 = "open_camera";
                c0m2.A05 = context.getString(R.string.shortcut_camera);
                c0m2.A03 = IconCompat.A02(context, R.drawable.ic_shortcut_camera_alt);
                c0m2.A0B = new Intent[]{new Intent(context, LauncherCameraActivity.class).setAction("android.intent.action.VIEW")};
                if (!TextUtils.isEmpty(c0m2.A05)) {
                    Intent[] intentArr = c0m2.A0B;
                    if (intentArr != null && intentArr.length != 0) {
                        arrayList.add(c0m2);
                    } else {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                } else {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
            }
            int A002 = A00(context);
            for (int i = 0; i < A07.size(); i++) {
                arrayList.add(A04(i, context, (C06C) A07.get(i), c0l7, c05w, c018708s, c0lf));
                if (A002 != arrayList.size()) {
                }
            }
            try {
                A0J(context, arrayList);
            } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
                abstractC000600i.A09("WaShortcutsHelper/rebuildDynamicShortcuts", null, true);
                Log.w("WaShortcutsHelper/exception happened. ", e);
            }
        }
    }

    public static void A0E(Context context, C06C c06c) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        Jid A022 = c06c.A02();
        if (A022 == null) {
            throw null;
        }
        arrayList.add(A022.getRawString());
        if (shortcutManager != null) {
            shortcutManager.disableShortcuts(arrayList);
        }
    }

    public static synchronized void A0G(Context context, C06C c06c, C0L7 c0l7, C05W c05w, C018708s c018708s, C0LF c0lf) {
        synchronized (C0M6.class) {
            List A022 = C0M7.A02(context);
            Jid A023 = c06c.A02();
            if (A023 != null) {
                if (A05(A022, A023.getRawString()) != null) {
                    Log.i("WaShortcutsApiHelper/publishShortcut/shortcut already published");
                    return;
                }
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(A01(Math.min(A022.size(), A00(context)), context, c06c, c0l7, c05w, c018708s, c0lf));
                return;
            }
            throw null;
        }
    }

    public static void A0H(Context context, AbstractC005302j abstractC005302j) {
        String rawString = abstractC005302j.getRawString();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        for (ShortcutInfo shortcutInfo : shortcutManager.getShortcuts(8)) {
            if (shortcutInfo.getId().equals(rawString)) {
                shortcutManager.removeLongLivedShortcuts(Collections.singletonList(shortcutInfo.getId()));
                return;
            }
        }
    }

    public static void A0J(Context context, List list) {
        Log.i("WaShortcutsApiHelper/rebuild shortcut lists");
        C0M7.A03(context);
        int A002 = A00(context);
        if (list.size() <= A002) {
            C0M7.A04(context, list);
        } else {
            C0M7.A04(context, list.subList(0, A002));
        }
    }
}
