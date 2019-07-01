$(document).ready(()=>{
    $(".btn-collapse").click((e)=> {
        e.preventDefault();
        var $this = $(this);
        var $collapse = $this.closest('.collapse-group').find('.collapse');
        $collapse.collapse('toggle');
    });
});



