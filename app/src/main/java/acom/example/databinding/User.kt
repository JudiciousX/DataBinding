package acom.example.databinding

import androidx.databinding.*

class User : BaseObservable() {
    //val firstName = ObservableField<String>()
    //var lastName = ObservableField<String>()
    var age = ObservableInt()

    val map = ObservableArrayMap<String, Any>().apply {
        put("firstName", "Google")
        put("lastName", "Inc.")
        put("age", 17)
    }

    @get:Bindable
    var firstName : String = "scout"
    set(value) {
        field = value
        notifyPropertyChanged(BR.firstName)
    }

    @get:Bindable
    var lastName : String = ""
    set(value) {
        field = value
        notifyPropertyChanged(BR.lastName)
    }
}