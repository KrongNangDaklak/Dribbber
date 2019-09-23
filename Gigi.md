---


---

<h1 id="gigi">GIGI</h1>
<p>Guys, This is some explain of GiGi application, with some things:</p>
<ul>
<li><strong>#000 App Business:</strong>
<ul>
<li>Main features</li>
<li>User story</li>
</ul>
</li>
<li><strong>#001 Technical Using</strong>
<ul>
<li><strong>001.01</strong> Architecture</li>
<li><strong>001.02</strong> Technical Used</li>
<li><strong>001.03</strong> Develop story</li>
</ul>
</li>
</ul>
<h2 id="technical">#001 Technical</h2>
<h3 id="architecture">#001.01 Architecture</h3>
<ul>
<li><strong>Three of layers explaintation</strong>
<ul>
<li>
<p><strong>Domain</strong>: Responsibility to excute all application UseCase,(Business)with thread handler.<br>
- Input: Params (optionnal)<br>
- Output: Data needed.<br>
- <strong>Two types (ways of UseCase)</strong></p>
<ul>
<li><strong>Observable</strong> UseCase</li>
<li><strong>Suspend UseCase</strong> ( like <code>Await</code> in other languages) with Kotlin Couroutines</li>
</ul>
</li>
<li>
<p><strong>Data</strong>: Responsibility to interact with awsonme things from internet, cache, to get the data and parsing it into <strong>Entity</strong>. Which needed from <strong>Domain</strong> layer</p>
</li>
<li>
<p><strong>Mobile UI</strong>: Expose all app User Interface, Details of MVPVM- DataBinding</p>
<ul>
<li><strong>Model</strong>: Presenting app infomation as Model, kclass.</li>
<li><strong>View</strong>: Exactly User interface, include View,Fragment, Activity, Dialog, bla bla…<br>
- Exose App UI, right<br>
- Any need, call the <strong>Presenter</strong><br>
- Observe <strong>ViewModel</strong> to exposing the UI<br>
- About UI: We use booth <strong>DataBinding</strong> and some case we handle it with Kotltin</li>
<li><strong>Presenter</strong>: Responsitbility to:<br>
- Interract with UseCase any what action of UI needed.<br>
- Pasing data into <strong>ViewModel</strong></li>
</ul>
</li>
<li>
<p><strong>Model <em>type</em> and <em>rule</em>:</strong></p>
<ul>
<li><strong>DTO</strong>: Model for Data layer</li>
<li><strong>Entity</strong>: Model for Domain layer</li>
<li><strong>Model</strong>: Model for UI layer</li>
<li><strong>ViewModel</strong>: Present Model for User Interface with Lifecycle Aware.</li>
<li><strong>Rule</strong>: Inner layer don’t call Outer layer. They speaking via the Bridge (in our app, we call it by <code>Mapper</code> class)</li>
</ul>
<p><img src="https://raw.githubusercontent.com/bufferapp/android-clean-architecture-boilerplate/master/art/data.png" alt="enter image description here"></p>
</li>
</ul>
</li>
</ul>
<h2 id="techical-used">Techical used</h2>
<ul>
<li><strong>Kotlin</strong></li>
<li><strong>Dagger</strong>: for Dependency Injection</li>
<li><strong>RxJava</strong>: to implement Observable pattern quickly</li>
<li><strong>Shimmer</strong>: to display awesome holder-preloading</li>
<li><strong>Glide</strong>: to display Image</li>
<li><strong>Toasty</strong>: to display beauty Toast</li>
<li><strong>Sweet alert dialog</strong>: to display beauty dialog</li>
<li><strong>Kotlin Coroutines</strong>: To apply await*</li>
</ul>
<h2 id="develop-story">Develop Story</h2>
<ul>
<li>Seprate three layer with above mindset</li>
<li>Use kotlin extentions</li>
<li>Apply dagger to present DI pattern</li>
<li>Create sample UI with TabActivity</li>
<li><strong>TabActivity</strong> with Tablayout in bottom, when click we replace fragment in to the activity.</li>
<li>Implement the UI</li>
<li>Still implement the UI</li>
<li>11/09: <strong>TabActivity</strong> can’t keep the state, I moved to Viewpager to keep the child fragments alive state.</li>
<li>12/09: implement UI with creating Group of final feature in real life, the data layer implement with <strong>Fake</strong> data, <strong>Model has defined</strong>, when the API ready, Just  replace Fake data with the online API. The app ready to flight. Right?</li>
<li>15/09: Aply DataBiding</li>
<li>18/09: Use <a href="https://github.com/tikivn/NoAdapter">NoAdapter</a> from Tiki team to easy display Recyclerview</li>
<li>23/09 thinking about apply <strong><a href="https://developer.android.com/guide/navigation">Navigation Component</a></strong> in to app to navigate app screen more cleaning</li>
</ul>

