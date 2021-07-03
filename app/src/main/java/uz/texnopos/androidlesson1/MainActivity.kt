package uz.texnopos.androidlesson1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val outerAdapter = OuterAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = outerAdapter
        setData()
    }

    private fun setData() {
        val models: MutableList<UserGroup> = mutableListOf()
        val list: MutableList<User> = mutableListOf()
        repeat(10) {
            val user = User("Sharapat $it", "Kalabaev $it")
            list.add(user)
        }
        models.add(UserGroup(list))
        val list1: MutableList<User> = mutableListOf()
        repeat(10) {
            val user = User("Maman $it", "Yakupov $it")
            list1.add(user)
        }
        models.add(UserGroup(list1))
        val list2: MutableList<User> = mutableListOf()
        repeat(10) {
            val user = User("Azam $it", "Anvarov $it")
            list2.add(user)
        }
        models.add(UserGroup(list2))
        val list3: MutableList<User> = mutableListOf()
        repeat(10) {
            val user = User("Ulugbek $it", "Baltabaev $it")
            list3.add(user)
        }
        models.add(UserGroup(list3))

        val list4: MutableList<User> = mutableListOf()
        repeat(10) {
            val user = User("Xayrulla $it", "Shamuratov $it")
            list4.add(user)
        }
        models.add(UserGroup(list4))

        val list5: MutableList<User> = mutableListOf()
        repeat(10) {
            val user = User("Aziza $it", "Jalgasbaeva $it")
            list5.add(user)
        }
        models.add(UserGroup(list5))
        val list6: MutableList<User> = mutableListOf()

        repeat(10) {
            val user = User("Atabek $it", "Nazarbaev $it")
            list6.add(user)
        }
        models.add(UserGroup(list6))
        val list7: MutableList<User> = mutableListOf()

        repeat(10) {
            val user = User("Merbek $it", "Tursinbaev $it")
            list7.add(user)
        }
        models.add(UserGroup(list7))
        val list8: MutableList<User> = mutableListOf()

        repeat(10) {
            val user = User("Allayar $it", "Kurbanbaev $it")
            list8.add(user)
        }
        models.add(UserGroup(list8))
        val list9: MutableList<User> = mutableListOf()

        repeat(10) {
            val user = User("Shuxrat $it", "Uzakov $it")
            list9.add(user)
        }
        models.add(UserGroup(list9))
        outerAdapter.userGroupList = models
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
