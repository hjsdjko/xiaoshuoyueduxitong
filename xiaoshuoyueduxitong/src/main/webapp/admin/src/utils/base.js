const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoshuoyueduxitong/",
            name: "xiaoshuoyueduxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoshuoyueduxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "小说阅读系统"
        } 
    }
}
export default base
