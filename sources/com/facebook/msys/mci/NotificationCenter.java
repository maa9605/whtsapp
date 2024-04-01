package com.facebook.msys.mci;

import X.AbstractRunnableC19880wM;
import X.C000200d;
import X.C0wI;
import X.C1YI;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.util.McfReferenceHolder;
import com.facebook.simplejni.NativeHolder;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class NotificationCenter {
    public static final String TAG = "NotificationCenter";
    public final Set mMainConfig;
    public NativeHolder mNativeHolder;
    public final Map mNativeScopeToJavaScope;
    public final Map mObserverConfigs;

    /* loaded from: classes.dex */
    public interface NotificationCallback {
        void onNewNotification(String str, Object obj, Map map);
    }

    private native void addObserverNative(String str);

    private native NativeHolder initNativeHolder();

    private native void removeObserverNative(String str);

    public NotificationCenter() {
        this(false);
    }

    public NotificationCenter(boolean z) {
        this.mNativeScopeToJavaScope = new HashMap();
        this.mObserverConfigs = new HashMap();
        this.mMainConfig = new HashSet();
        if (!z) {
            this.mNativeHolder = initNativeHolder();
        }
    }

    public synchronized void addObserver(NotificationCallback notificationCallback, String str, Object obj) {
        if (notificationCallback == null) {
            throw null;
        }
        if (str != null) {
            if (observerHasConfig(notificationCallback, str, obj)) {
                return;
            }
            if (obj != null) {
                addScopeToMappingOfNativeToJava(obj);
            }
            addObserverConfig(notificationCallback, str, obj);
            if (this.mMainConfig.add(str)) {
                addObserverNative(str);
            }
            return;
        }
        throw null;
    }

    private boolean addObserverConfig(NotificationCallback notificationCallback, String str, Object obj) {
        C0wI c0wI = (C0wI) this.mObserverConfigs.get(notificationCallback);
        if (c0wI == null) {
            c0wI = new C0wI();
            this.mObserverConfigs.put(notificationCallback, c0wI);
        }
        if (obj == null) {
            return c0wI.A01.add(str);
        }
        Set set = (Set) c0wI.A00.get(obj);
        if (set == null) {
            set = new HashSet();
            c0wI.A00.put(obj, set);
        }
        return set.add(str);
    }

    private void addScopeToMappingOfNativeToJava(Object obj) {
        Long extractNativePointerFromMcfReference = extractNativePointerFromMcfReference(obj);
        if (extractNativePointerFromMcfReference == null) {
            throwInvalidMcfReferenceField();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            this.mNativeScopeToJavaScope.put(extractNativePointerFromMcfReference, obj);
        }
    }

    private void dispatchNotificationToCallbacks(final String str, Long l, Object obj) {
        final Object obj2;
        Set set;
        if (obj != null && !(obj instanceof Map)) {
            StringBuilder A0P = C000200d.A0P("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ");
            A0P.append(obj.getClass().getName());
            throw new RuntimeException(A0P.toString());
        }
        final Map map = (Map) obj;
        final ArrayList arrayList = new ArrayList();
        synchronized (this) {
            obj2 = l != null ? this.mNativeScopeToJavaScope.get(l) : null;
            for (Map.Entry entry : this.mObserverConfigs.entrySet()) {
                C0wI c0wI = (C0wI) entry.getValue();
                if (c0wI.A01.contains(str) || ((set = (Set) c0wI.A00.get(obj2)) != null && set.contains(str))) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Execution.executePossiblySync(new AbstractRunnableC19880wM() { // from class: X.1YJ
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("dispatchNotificationToCallbacks");
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((NotificationCenter.NotificationCallback) it.next()).onNewNotification(str, obj2, map);
                }
            }
        }, 1);
    }

    public static Long extractNativePointerFromMcfReference(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mMcfReference");
            declaredField.setAccessible(true);
            if (!declaredField.getType().equals(McfReferenceHolder.class)) {
                throwInvalidMcfReferenceField();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            return Long.valueOf(((McfReferenceHolder) declaredField.get(obj)).nativeReference);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    private boolean notificationNameExistsInSomeObserver(String str) {
        for (Map.Entry entry : this.mObserverConfigs.entrySet()) {
            C0wI c0wI = (C0wI) entry.getValue();
            if (!c0wI.A01.contains(str)) {
                Iterator it = new HashSet(c0wI.A00.entrySet()).iterator();
                while (it.hasNext()) {
                    if (((Set) ((Map.Entry) it.next()).getValue()).contains(str)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean observerHasConfig(NotificationCallback notificationCallback, String str, Object obj) {
        C0wI c0wI = (C0wI) this.mObserverConfigs.get(notificationCallback);
        if (c0wI == null) {
            return false;
        }
        if (obj == null) {
            return c0wI.A01.contains(str);
        }
        Set set = (Set) c0wI.A00.get(obj);
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public synchronized void removeEveryObserver(NotificationCallback notificationCallback) {
        HashSet hashSet;
        HashMap hashMap;
        if (notificationCallback != null) {
            C0wI c0wI = (C0wI) this.mObserverConfigs.get(notificationCallback);
            if (c0wI != null) {
                C1YI c1yi = new C1YI(this, notificationCallback);
                synchronized (c0wI) {
                    hashSet = new HashSet(c0wI.A01);
                    hashMap = new HashMap();
                    Iterator it = new HashSet(c0wI.A00.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        hashMap.put(entry.getKey(), new HashSet((Collection) entry.getValue()));
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    c1yi.A01.removeObserver(c1yi.A00, (String) it2.next(), null);
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    Object key = entry2.getKey();
                    for (String str : (Set) entry2.getValue()) {
                        c1yi.A01.removeObserver(c1yi.A00, str, key);
                    }
                }
                this.mObserverConfigs.remove(notificationCallback);
            }
        } else {
            throw null;
        }
    }

    public synchronized void removeObserver(NotificationCallback notificationCallback, String str, Object obj) {
        if (notificationCallback == null) {
            throw null;
        }
        if (str != null) {
            if (observerHasConfig(notificationCallback, str, obj)) {
                removeObserverConfig(notificationCallback, str, obj);
                if (obj != null && !scopeExistInAnyConfig(obj)) {
                    removeScopeFromNativeToJavaMappings(obj);
                }
                if (!notificationNameExistsInSomeObserver(str)) {
                    this.mMainConfig.remove(str);
                    removeObserverNative(str);
                }
                return;
            }
            return;
        }
        throw null;
    }

    private boolean removeObserverConfig(NotificationCallback notificationCallback, String str, Object obj) {
        boolean z;
        C0wI c0wI = (C0wI) this.mObserverConfigs.get(notificationCallback);
        if (c0wI != null) {
            if (obj == null) {
                z = c0wI.A01.remove(str);
            } else {
                Set set = (Set) c0wI.A00.get(obj);
                if (set != null) {
                    z = set.remove(str);
                    if (set.isEmpty()) {
                        c0wI.A00.remove(obj);
                    }
                } else {
                    z = false;
                }
            }
            if (c0wI.A01.isEmpty() && c0wI.A00.isEmpty()) {
                this.mObserverConfigs.remove(notificationCallback);
            }
            return z;
        }
        return false;
    }

    private void removeScopeFromNativeToJavaMappings(Object obj) {
        Long extractNativePointerFromMcfReference = extractNativePointerFromMcfReference(obj);
        if (extractNativePointerFromMcfReference == null) {
            throwInvalidMcfReferenceField();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            this.mNativeScopeToJavaScope.remove(extractNativePointerFromMcfReference);
        }
    }

    private boolean scopeExistInAnyConfig(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map.Entry entry : this.mObserverConfigs.entrySet()) {
            C0wI c0wI = (C0wI) entry.getValue();
            if (c0wI != null) {
                if (c0wI.A00.containsKey(obj)) {
                    return true;
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    private void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static void throwInvalidMcfReferenceField() {
        throw new RuntimeException("Scope object needs to have an mMcfReference field of type McfReferenceHolder");
    }
}
